package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class TemplateInfo extends EditableBean<TemplateInfo> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TEMPLATE_FROM_ALBUM;
    public static String TEMPLATE_FROM_EDIT;
    public String dirPath;
    public String draftPath;
    public String logoUrl;
    public String materialId;
    public String metaJsonPath;
    public String resourceType;
    public int resultHeight;
    public String resultPath;
    public int resultWidth;
    public String singleHolderPath;
    public String templateContent;
    public int holderCount = 0;
    public String fromPos = TEMPLATE_FROM_ALBUM;
    public boolean isDirty = false;
    public boolean isCloudTransfer = false;
    public boolean isContentDirty = false;

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : "TemplateInfo{}";
    }

    static {
        kge.a(-1833054396);
        kge.a(1028243835);
        TEMPLATE_FROM_EDIT = "edit";
        TEMPLATE_FROM_ALBUM = ChatInputConstant.PANEL_ID_ALBUM;
    }
}
