package anetwork.channel.entity;

import anetwork.channel.Param;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class StringParam implements Param {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String key;
    private String value;

    static {
        kge.a(80520158);
        kge.a(-545126273);
    }

    @Override // anetwork.channel.Param
    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : this.key;
    }

    @Override // anetwork.channel.Param
    public String getValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this}) : this.value;
    }

    public StringParam(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
