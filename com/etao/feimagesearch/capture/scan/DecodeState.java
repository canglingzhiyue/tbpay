package com.etao.feimagesearch.capture.scan;

/* loaded from: classes3.dex */
public enum DecodeState {
    IDLE(0),
    PREVIEW_DECODE(1),
    ALBUM_DECODE(2);
    
    private int stateValue;

    DecodeState(int i) {
        this.stateValue = i;
    }

    public int getStateValue() {
        return this.stateValue;
    }
}
