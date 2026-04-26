package ht.pierre.tp1.tp1pierre.llm;

public record LlmInteraction(
        String questionJson,
        String reponseJson,
        String reponseExtraite
) {}