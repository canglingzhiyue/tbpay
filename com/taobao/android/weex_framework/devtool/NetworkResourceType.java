package com.taobao.android.weex_framework.devtool;

/* loaded from: classes6.dex */
public enum NetworkResourceType {
    Other(0),
    Document(1),
    Stylesheet(2),
    Image(3),
    Media(4),
    Font(5),
    Script(6),
    Fetch(7),
    WebSocket(8);
    
    public final int value;

    NetworkResourceType(int i) {
        this.value = i;
    }
}
