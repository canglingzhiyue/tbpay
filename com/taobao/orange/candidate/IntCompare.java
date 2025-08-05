package com.taobao.orange.candidate;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class IntCompare extends DefCandidateCompare {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-818842288);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean equals(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c24d6de", new Object[]{this, str, str2})).booleanValue() : Integer.parseInt(str) == Integer.parseInt(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean equalsNot(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ecd44b3", new Object[]{this, str, str2})).booleanValue() : Integer.parseInt(str) != Integer.parseInt(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean greater(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4d1ac19", new Object[]{this, str, str2})).booleanValue() : Integer.parseInt(str) > Integer.parseInt(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean greaterEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6920a978", new Object[]{this, str, str2})).booleanValue() : Integer.parseInt(str) >= Integer.parseInt(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean less(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd7e96b8", new Object[]{this, str, str2})).booleanValue() : Integer.parseInt(str) < Integer.parseInt(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean lessEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8df4e0d7", new Object[]{this, str, str2})).booleanValue() : Integer.parseInt(str) <= Integer.parseInt(str2);
    }
}
