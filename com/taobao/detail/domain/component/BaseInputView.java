package com.taobao.detail.domain.component;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class BaseInputView extends BaseComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String data;
    public String key;
    public int type;

    /* loaded from: classes7.dex */
    public static class Element implements Serializable {
        public String altImg;
        public String altText;
        public boolean changeable;
        public boolean selected;
        public String text;
        public String value;

        static {
            kge.a(-1921746652);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(865476332);
    }

    public BaseInputView parse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseInputView) ipChange.ipc$dispatch("a5f4871f", new Object[]{this});
        }
        int i = this.type;
        if (i == 1) {
            return (BaseInputView) JSON.parseObject(this.data, CheckBox.class);
        }
        if (i == 2) {
            return (BaseInputView) JSON.parseObject(this.data, RadioBox.class);
        }
        if (i == 3) {
            return (BaseInputView) JSON.parseObject(this.data, Tree.class);
        }
        return null;
    }
}
