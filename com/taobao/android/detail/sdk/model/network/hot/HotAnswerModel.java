package com.taobao.android.detail.sdk.model.network.hot;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

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
        kge.a(2078937927);
        kge.a(1028243835);
    }

    public HotAnswerModel() {
        tpc.a("com.taobao.android.detail.sdk.model.network.hot.HotAnswerModel");
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
