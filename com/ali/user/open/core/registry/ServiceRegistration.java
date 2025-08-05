package com.ali.user.open.core.registry;

import java.util.Map;

/* loaded from: classes2.dex */
public interface ServiceRegistration {
    void setProperties(Map<String, String> map);

    void unregister();
}
