package com.taobao.dp;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.InvalidParameterException;
import tb.kge;

@Deprecated
/* loaded from: classes7.dex */
public final class OnlineHost {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int Custrom_Imdex = 3;
    public static final OnlineHost GENERAL;
    public static final OnlineHost JAPAN;
    public static final OnlineHost USA;
    private String mHost;
    private int mIndex;
    private String mName;

    static {
        kge.a(1513547979);
        GENERAL = new OnlineHost("GENERAL", "ynuf.aliapp.org", 0);
        USA = new OnlineHost("USA", "us.ynuf.aliapp.org", 1);
        JAPAN = new OnlineHost("JAPAN", "ynuf.aliapp.org", 2);
    }

    private OnlineHost(String str, String str2, int i) {
        this.mName = str;
        this.mHost = str2;
        this.mIndex = i;
    }

    public static OnlineHost valueof(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnlineHost) ipChange.ipc$dispatch("15cf3421", new Object[]{str});
        }
        if (str == null || str.length() == 0) {
            throw new InvalidParameterException("Invalid Host");
        }
        return new OnlineHost("", str, 3);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.mName;
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this}) : this.mHost;
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.mIndex;
    }
}
