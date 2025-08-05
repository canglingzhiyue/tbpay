package com.taobao.android.detail.core.model.datamodel.hot;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class HotAnswerModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int errCode;
    public int len;
    public String question;
    public String sign;
    public String tip;

    /* loaded from: classes4.dex */
    public enum AnswerErrorType {
        SUCCESS(0),
        NOLOGIN(1),
        DEGRADE(2),
        EANSWER(3),
        LIMIT(4),
        UNKNOWN(-1);
        
        int code;

        AnswerErrorType(int i) {
            this.code = i;
        }
    }

    static {
        kge.a(817803099);
        kge.a(1028243835);
    }

    public HotAnswerModel() {
        emu.a("com.taobao.android.detail.core.model.datamodel.hot.HotAnswerModel");
    }

    public ArrayList<String> getTip() {
        char[] charArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab53b146", new Object[]{this});
        }
        String str = this.tip;
        if (str == null || (charArray = str.trim().toCharArray()) == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (char c : charArray) {
            arrayList.add(String.valueOf(c));
        }
        return arrayList;
    }

    public boolean isDegreade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99a0939e", new Object[]{this})).booleanValue() : this.errCode == AnswerErrorType.DEGRADE.code;
    }
}
