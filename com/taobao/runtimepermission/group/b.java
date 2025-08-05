package com.taobao.runtimepermission.group;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Map<String, Set<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        HashMap hashMap = new HashMap(7);
        hashMap.put("LOCATION", Collections.unmodifiableSet(new HashSet<String>(2) { // from class: com.taobao.runtimepermission.group.GroupedPermissionManifest$1
            {
                add("COARSE_LOCATION");
                add("FINE_LOCATION");
            }
        }));
        hashMap.put("CALENDAR", Collections.unmodifiableSet(new HashSet<String>(2) { // from class: com.taobao.runtimepermission.group.GroupedPermissionManifest$2
            {
                add("READ_CALENDAR");
                add("WRITE_CALENDAR");
            }
        }));
        hashMap.put("CONTACTS", Collections.unmodifiableSet(new HashSet<String>(2) { // from class: com.taobao.runtimepermission.group.GroupedPermissionManifest$3
            {
                add("READ_CONTACTS");
                add("WRITE_CONTACTS");
            }
        }));
        hashMap.put("MEDIA", Collections.unmodifiableSet(new HashSet<String>(6) { // from class: com.taobao.runtimepermission.group.GroupedPermissionManifest$4
            {
                add("READ_IMAGES");
                add("WRITE_IMAGES");
                add("READ_VIDEO");
                add("WRITE_VIDEO");
                add("READ_AUDIO");
                add("WRITE_AUDIO");
            }
        }));
        hashMap.put("MICROPHONE", Collections.unmodifiableSet(new HashSet<String>(1) { // from class: com.taobao.runtimepermission.group.GroupedPermissionManifest$5
            {
                add("RECORD_AUDIO");
            }
        }));
        hashMap.put("CAMERA", Collections.unmodifiableSet(new HashSet<String>(1) { // from class: com.taobao.runtimepermission.group.GroupedPermissionManifest$6
            {
                add("TAKE_CAMERA");
            }
        }));
        hashMap.put("PASTEBOARD", Collections.unmodifiableSet(new HashSet<String>(1) { // from class: com.taobao.runtimepermission.group.GroupedPermissionManifest$7
            {
                add("READ_PASTEBOARD");
            }
        }));
        return Collections.unmodifiableMap(hashMap);
    }
}
