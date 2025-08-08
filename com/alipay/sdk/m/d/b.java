package com.alipay.sdk.m.d;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<UUID, a> f6155a = new HashMap<>();
    private static final HashMap<String, a> b = new HashMap<>();

    public static void a(a aVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4309938c", new Object[]{aVar, intent});
        } else if (aVar == null || intent == null) {
        } else {
            UUID randomUUID = UUID.randomUUID();
            f6155a.put(randomUUID, aVar);
            intent.putExtra("i_uuid_b_c", randomUUID);
        }
    }

    public static a a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1ac37bf8", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
        if (!(serializableExtra instanceof UUID)) {
            return null;
        }
        return f6155a.remove(serializableExtra);
    }

    public static void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7ffcd9", new Object[]{aVar, str});
        } else if (aVar == null || StringUtils.isEmpty(str)) {
        } else {
            b.put(str, aVar);
        }
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e374e60b", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            return b.remove(str);
        }
        return null;
    }
}
