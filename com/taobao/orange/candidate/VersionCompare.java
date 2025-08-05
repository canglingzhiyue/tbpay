package com.taobao.orange.candidate;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class VersionCompare extends DefCandidateCompare {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1667888313);
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
    public boolean greater(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4d1ac19", new Object[]{this, str, str2})).booleanValue() : compareVersion(str, str2) == 1;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean greaterEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6920a978", new Object[]{this, str, str2})).booleanValue() : compareVersion(str, str2) != -1;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean less(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd7e96b8", new Object[]{this, str, str2})).booleanValue() : compareVersion(str, str2) == -1;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, com.taobao.orange.b
    public boolean lessEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8df4e0d7", new Object[]{this, str, str2})).booleanValue() : compareVersion(str, str2) != 1;
    }

    private static int compareVersion(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bbef41", new Object[]{str, str2})).intValue();
        }
        if (str.equals(str2)) {
            return 0;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        int i2 = 0;
        while (i < min) {
            i2 = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
            if (i2 != 0) {
                break;
            }
            i++;
        }
        if (i2 != 0) {
            return i2 > 0 ? 1 : -1;
        }
        for (int i3 = i; i3 < split.length; i3++) {
            if (Integer.parseInt(split[i3]) > 0) {
                return 1;
            }
        }
        while (i < split2.length) {
            if (Integer.parseInt(split2[i]) > 0) {
                return -1;
            }
            i++;
        }
        return 0;
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
