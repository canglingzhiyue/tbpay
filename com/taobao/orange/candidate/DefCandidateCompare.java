package com.taobao.orange.candidate;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.b;
import tb.kge;

/* loaded from: classes.dex */
public class DefCandidateCompare implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(556705261);
        kge.a(-1896739875);
    }

    @Override // com.taobao.orange.b
    public boolean equals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c24d6de", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.orange.b
    public boolean equalsNot(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ecd44b3", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.orange.b
    public boolean fuzzy(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81bf5629", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.orange.b
    public boolean fuzzyNot(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44d07d88", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.orange.b
    public boolean greater(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d1ac19", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.orange.b
    public boolean greaterEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6920a978", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.orange.b
    public boolean less(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd7e96b8", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.orange.b
    public boolean lessEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df4e0d7", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }
}
