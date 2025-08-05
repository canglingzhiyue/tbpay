package com.taobao.orange.candidate;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class StringCompare extends DefCandidateCompare {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1400355334);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean equals(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c24d6de", new Object[]{this, str, str2})).booleanValue() : str.equals(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean equalsNot(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ecd44b3", new Object[]{this, str, str2})).booleanValue() : !str.equals(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean fuzzy(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81bf5629", new Object[]{this, str, str2})).booleanValue() : str.startsWith(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean fuzzyNot(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("44d07d88", new Object[]{this, str, str2})).booleanValue() : !str.startsWith(str2);
    }
}
