package com.alibaba.security.wukong.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.security.wukong.model.meta.Data;
import com.alibaba.security.wukong.model.meta.Text;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class TextRiskSample extends CCRCRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Text mText;

    public TextRiskSample(String str, String str2) {
        super(str);
        this.mText = new Text(str2);
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public String getMetaType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3168d9c4", new Object[]{this}) : "text";
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public Data getRawData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Data) ipChange.ipc$dispatch("b1c4156c", new Object[]{this}) : this.mText;
    }

    public Text getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Text) ipChange.ipc$dispatch("6d7a1030", new Object[]{this}) : this.mText;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public long getTs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue() : this.mText.getTs();
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        Text text = this.mText;
        return text != null && !StringUtils.isEmpty(text.getContent());
    }

    public void setText(Text text) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df242660", new Object[]{this, text});
        } else {
            this.mText = text;
        }
    }

    public TextRiskSample(String str, Map<String, Object> map, String str2) {
        super(str, map);
        this.mText = new Text(str2);
        getExtras().putAll(map);
    }

    public TextRiskSample(String str, Text text) {
        super(str);
        this.mText = text;
        getExtras().putAll(text.getExtras());
    }

    public TextRiskSample(String str, Map<String, Object> map, Text text) {
        super(str, map);
        this.mText = text;
        getExtras().putAll(text.getExtras());
    }
}
