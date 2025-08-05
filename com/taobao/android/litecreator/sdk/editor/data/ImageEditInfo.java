package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.AbsEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class ImageEditInfo extends AbsEditInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int V1 = 0;
    public static final int V2 = 1;
    public Adjust adjust;
    public AiQuality aiQuality;
    public Beauty beauty;
    public Crop crop;
    public Filter filter;
    public List<RichLabel> labels;
    public Music music;
    public List<Paster> pasters;
    public TemplateInfo templateInfo;
    public int version = 1;
    public Volume volume;

    static {
        kge.a(-2116576041);
        kge.a(1028243835);
    }

    public boolean noneEdit() {
        List<Paster> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b75238ed", new Object[]{this})).booleanValue() : this.filter == null && this.crop == null && this.aiQuality == null && ((list = this.pasters) == null || list.size() <= 0) && this.beauty == null && this.adjust == null && this.templateInfo == null;
    }

    public boolean noneEditOnlyTemplate() {
        List<Paster> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("394e4b53", new Object[]{this})).booleanValue() : this.filter == null && this.crop == null && this.aiQuality == null && ((list = this.pasters) == null || list.size() <= 0) && this.beauty == null && this.adjust == null;
    }

    public boolean cropOnly() {
        List<Paster> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99c77ce7", new Object[]{this})).booleanValue() : this.filter == null && this.aiQuality == null && ((list = this.pasters) == null || list.size() <= 0) && this.beauty == null && this.adjust == null && this.templateInfo == null;
    }

    public boolean isEditedForCanExitDirectly() {
        List<Paster> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("792f4339", new Object[]{this})).booleanValue() : this.filter == null && ((list = this.pasters) == null || list.size() <= 0) && this.labels == null && this.beauty == null && this.adjust == null && this.templateInfo == null;
    }
}
