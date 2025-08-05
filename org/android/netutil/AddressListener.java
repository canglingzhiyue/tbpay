package org.android.netutil;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public abstract class AddressListener extends NetListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public AddressListener() {
        super(NetListenerType.NL_NEW_IP_ADDRESS);
    }

    public abstract void onNewAddress(String str);
}
