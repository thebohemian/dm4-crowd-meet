package eu.crowdliterature.model;

import de.deepamehta.core.JSONEnabled;
import eu.crowdliterature.DTOHelper;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;



public class Person implements JSONEnabled {

    // ---------------------------------------------------------------------------------------------- Instance Variables

    private JSONObject json;

    // ---------------------------------------------------------------------------------------------------- Constructors

    public Person(String name, String email, String placeOfLiving, String yearOfBirth, String placeOfBirth, String notes, JSONArray urls,
                  JSONArray nationalities, JSONArray languages, JSONArray institutions, JSONArray works,
                  JSONArray recommendedEvents) {
        try {
            json = new JSONObject()
                .put("name", name)
                .put("email", DTOHelper.escapeEmail(email))
                .put("placeOfLiving", placeOfLiving)
                .put("yearOfBirth", yearOfBirth)
                .put("placeOfBirth", placeOfBirth)
                .put("notes", notes)
                .put("urls", urls)
                .put("nationalities", nationalities)
                .put("languages", languages)
                .put("institutions", institutions)
                .put("works", works)
                .put("recommendedEvents", recommendedEvents);
        } catch (Exception e) {
            throw new RuntimeException("Serialization failed (" + this + ")", e);
        }
    }

    // -------------------------------------------------------------------------------------------------- Public Methods

    @Override
    public JSONObject toJSON() {
        return json;
    }
}
