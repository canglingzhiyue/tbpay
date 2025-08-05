package anetwork.channel.entity;

import anetwork.channel.Header;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class BasicHeader implements Header {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String name;
    private final String value;

    static {
        kge.a(449495357);
        kge.a(55111899);
    }

    public BasicHeader(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.name = str;
        this.value = str2;
    }

    @Override // anetwork.channel.Header
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    @Override // anetwork.channel.Header
    public String getValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this}) : this.value;
    }
}
