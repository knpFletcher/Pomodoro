package com.teamtreehouse.pomodoro.model;

public class Attempt {

    private String mMessage;
    private int mRemainingSeconds;
    private AttemptKind mKind;

    public Attempt(String message, AttemptKind kind) {
        mMessage = message;
        mKind = kind;
        mRemainingSeconds = mKind.getTotalSeconds();
    }

    public String getMessage() {
        return mMessage;
    }

    public int getRemainingSeconds() {
        return mRemainingSeconds;
    }

    public AttemptKind getKind() {
        return mKind;
    }

    public void setMessage(String message) {
        mMessage = message;
    }
}
