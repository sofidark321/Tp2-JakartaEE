package ma.emsi.jouida.tp2jouidasoufiane.llm;
/**
 * Record representing an interaction with a Large Language Model (LLM).
 * Contains the request JSON, response JSON, and the extracted response text.
 */
public  record LlmInteraction(
        /**
         * The formatted JSON request sent to the LLM API.
         */
        String questionJson,

        /**
         * The complete JSON response received from the LLM API.
         */
        String reponseJson,

        /**
         * The extracted text response from the LLM, parsed from the JSON response.
         */
        String reponseExtraite
) {

}