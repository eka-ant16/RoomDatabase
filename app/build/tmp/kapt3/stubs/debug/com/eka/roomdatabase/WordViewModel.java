package com.eka.roomdatabase;

import java.lang.System;

/**
 * View Model to keep a reference to the word repository and
 * an up-to-date list of all words.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/eka/roomdatabase/WordViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/eka/roomdatabase/WordRepository;", "(Lcom/eka/roomdatabase/WordRepository;)V", "allWords", "Landroidx/lifecycle/LiveData;", "", "Lcom/eka/roomdatabase/Word;", "getAllWords", "()Landroidx/lifecycle/LiveData;", "insert", "Lkotlinx/coroutines/Job;", "word", "app_debug"})
public final class WordViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.eka.roomdatabase.Word>> allWords = null;
    private final com.eka.roomdatabase.WordRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.eka.roomdatabase.Word>> getAllWords() {
        return null;
    }
    
    /**
     * Launching a new coroutine to insert the data in a non-blocking way
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.eka.roomdatabase.Word word) {
        return null;
    }
    
    public WordViewModel(@org.jetbrains.annotations.NotNull()
    com.eka.roomdatabase.WordRepository repository) {
        super();
    }
}