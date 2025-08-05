package com.taobao.android.litecreator.base.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.meta.UGCBase;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class UGCVideo extends UGCBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public VideoBean compress;
    public EditorInfo editorInfo;
    public VideoBean origin;
    public VideoBean raw;
    public VideoBean remote;

    static {
        kge.a(785864341);
        kge.a(1028243835);
    }

    public UGCVideo() {
        setMeta("videoEditNoneEdited", true);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UGCVideo{origin=" + this.origin + ", compress=" + this.compress + ", remote=" + this.remote + ", meta=" + getMeta() + ", editorInfo=" + this.editorInfo + '}';
    }
}
