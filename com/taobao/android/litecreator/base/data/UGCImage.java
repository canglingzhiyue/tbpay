package com.taobao.android.litecreator.base.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.meta.UGCBase;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.TemplateInfo;
import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class UGCImage extends UGCBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageBean compress;
    public EditorInfo editorInfo;
    public ImageBean origin;
    public ImageBean remote;
    public ImageBean templateExport;
    public TemplateInfo templateInfo;
    public ArrayList<UGCLabel> labels = new ArrayList<>();
    public boolean immutable = false;
    public boolean isImgTemplateExport = false;

    static {
        kge.a(773974901);
        kge.a(-44855220);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UGCImage{origin=" + this.origin + ", compress=" + this.compress + ", remote=" + this.remote + ", labels=" + this.labels + ", meta=" + getMeta() + '}';
    }
}
