package de.telran.Ex4_02_09.Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertIndex {
    private final Map<Word, List<DocumentId>> storage = new HashMap<>();


    public List<DocumentId> getDocumentIds(Word word) {
        List<DocumentId> documentsIds = storage.get(word);
        if (documentsIds == null) {
            return List.of();
        }
        return documentsIds;
    }

    public void save(DocumentId documentId, List<Word> words) {
        for (Word word : words) {
            List<DocumentId> documentIds = storage.get(word);
            if (documentIds == null) {
                documentIds = new ArrayList<>();
            }
            documentIds.add(documentId);
            storage.put(word, documentIds);
        }
    }
}
