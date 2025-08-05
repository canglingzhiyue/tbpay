package com.taobao.orange.candidate;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.f;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.eau;
import tb.kge;

/* loaded from: classes.dex */
public class HashCompare extends DefCandidateCompare {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HashCompare";
    private static Pattern p;

    static {
        kge.a(1968742365);
        p = Pattern.compile("\\d+");
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean equals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c24d6de", new Object[]{this, str, str2})).booleanValue();
        }
        Matcher matcher = p.matcher(str2);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(Integer.valueOf(Integer.parseInt(matcher.group())));
        }
        if (arrayList.size() != 3) {
            throw new IllegalArgumentException("did_hash candidate format is illegal");
        }
        long d = f.d(str) % ((Integer) arrayList.get(0)).intValue();
        if (OLog.isPrintLog(0)) {
            OLog.v(TAG, eau.PARSER_TAG, "mod", Long.valueOf(d));
        }
        return d >= ((long) ((Integer) arrayList.get(1)).intValue()) && d <= ((long) ((Integer) arrayList.get(2)).intValue());
    }
}
