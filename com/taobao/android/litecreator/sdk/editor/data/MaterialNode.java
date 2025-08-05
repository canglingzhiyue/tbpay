package com.taobao.android.litecreator.sdk.editor.data;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class MaterialNode implements Serializable {
    public static final String NODE_TYPE_FILTER = "video_editor.filter@";
    public static final String NODE_TYPE_MARVEL = "marvelTemplate";
    public static final String NODE_TYPE_MUSIC = "video_editor.music@";
    public String nodePath;
    public String nodeType;

    static {
        kge.a(1322422981);
        kge.a(1028243835);
    }

    public MaterialNode() {
    }

    public MaterialNode(String str, String str2) {
        this.nodeType = str;
        this.nodePath = str2;
    }
}
