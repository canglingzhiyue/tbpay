package com.etao.feimagesearch.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.com;
import tb.kge;
import tb.nmm;

/* loaded from: classes4.dex */
public class al {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HAS_MEDIA_PERMISSION = 0;
    public static final int NO_MEDIA_PERMISSION = -2;
    public static final int NO_MEDIA_PERMISSION_EXCLUDE_PART_AUTH = -1;

    /* loaded from: classes4.dex */
    public interface a {
    }

    static {
        kge.a(-958028856);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equals(com.etao.feimagesearch.config.b.a("image_search", "use_sys_album", "false"));
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return true;
        }
        if (i < 33) {
            return context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
        }
        boolean z = context.checkSelfPermission(com.taobao.android.litecreator.util.al.READ_MEDIA_IMAGES) == 0 && context.checkSelfPermission(com.taobao.android.litecreator.util.al.READ_MEDIA_VIDEO) == 0;
        return i < 34 ? z : z || context.checkSelfPermission(com.taobao.android.litecreator.util.al.READ_MEDIA_VISUAL_USER_SELECTED) == 0;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return 0;
        }
        if (i < 33) {
            return context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 ? 0 : -2;
        }
        if (context.checkSelfPermission(com.taobao.android.litecreator.util.al.READ_MEDIA_IMAGES) != 0 || context.checkSelfPermission(com.taobao.android.litecreator.util.al.READ_MEDIA_VIDEO) != 0) {
            z = false;
        }
        if (i < 34) {
            return z ? 0 : -2;
        } else if (z) {
            return 0;
        } else {
            return context.checkSelfPermission(com.taobao.android.litecreator.util.al.READ_MEDIA_VISUAL_USER_SELECTED) == 0 ? -1 : -2;
        }
    }

    public static void a(String str, boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863ee84b", new Object[]{str, new Boolean(z), aVar});
        } else {
            b(str, z, aVar);
        }
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue() : (activity.getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) ? Build.VERSION.SDK_INT >= 23 && !ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.READ_EXTERNAL_STORAGE") : !ActivityCompat.shouldShowRequestPermissionRationale(activity, com.taobao.android.litecreator.util.al.READ_MEDIA_IMAGES) || !ActivityCompat.shouldShowRequestPermissionRationale(activity, com.taobao.android.litecreator.util.al.READ_MEDIA_VIDEO);
    }

    public static void a(Activity activity, String str, a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed587ed", new Object[]{activity, str, aVar});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return;
        }
        if (i < 33) {
            if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                return;
            }
            a(str, aVar);
            return;
        }
        boolean z2 = activity.checkSelfPermission(com.taobao.android.litecreator.util.al.READ_MEDIA_IMAGES) == 0 && activity.checkSelfPermission(com.taobao.android.litecreator.util.al.READ_MEDIA_VIDEO) == 0;
        if (i < 34) {
            if (!z2) {
                b(str, false, aVar);
            } else if (aVar == null) {
            }
        } else if (z2) {
        } else {
            if (activity.checkSelfPermission(com.taobao.android.litecreator.util.al.READ_MEDIA_VISUAL_USER_SELECTED) == 0) {
                z = true;
            }
            if (z) {
                return;
            }
            b(str, true, aVar);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(com.b());
        }
        return true;
    }

    private static void b(String str, boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132bff6a", new Object[]{str, new Boolean(z), aVar});
            return;
        }
        Log.e("Permission", "Request Permission");
        com.taobao.runtimepermission.f.a(com.b(), z ? new String[]{com.taobao.android.litecreator.util.al.READ_MEDIA_IMAGES, com.taobao.android.litecreator.util.al.READ_MEDIA_VIDEO, com.taobao.android.litecreator.util.al.READ_MEDIA_VISUAL_USER_SELECTED} : new String[]{com.taobao.android.litecreator.util.al.READ_MEDIA_IMAGES, com.taobao.android.litecreator.util.al.READ_MEDIA_VIDEO}).b("biz_imgsearch").a(new nmm() { // from class: com.etao.feimagesearch.util.al.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nmm
            public void a(String[] strArr, int[] iArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0ebed05", new Object[]{this, strArr, iArr});
                } else if (a.this != null && strArr.length == iArr.length) {
                    int i = -1;
                    int i2 = -1;
                    int i3 = -1;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        String str2 = strArr[i4];
                        if (com.taobao.android.litecreator.util.al.READ_MEDIA_IMAGES.equals(str2)) {
                            i = i4;
                        } else if (com.taobao.android.litecreator.util.al.READ_MEDIA_VIDEO.equals(str2)) {
                            i2 = i4;
                        } else if (com.taobao.android.litecreator.util.al.READ_MEDIA_VISUAL_USER_SELECTED.equals(str2)) {
                            i3 = i4;
                        }
                    }
                    if (i < 0 || i2 < 0) {
                        return;
                    }
                    int i5 = iArr[i];
                    int i6 = iArr[i2];
                    if ((i5 != 0 || i6 != 0) && i3 < 0) {
                    }
                }
            }
        }).a(true).a(str).a(0L).a();
    }

    private static void a(String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b25739b", new Object[]{str, aVar});
        } else {
            com.taobao.runtimepermission.f.a(com.b(), new String[]{"android.permission.READ_EXTERNAL_STORAGE"}).b("biz_imgsearch").a(new ac() { // from class: com.etao.feimagesearch.util.al.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    }
                }
            }).b(new ac() { // from class: com.etao.feimagesearch.util.al.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    }
                }
            }).a(true).a(str).a(com.etao.feimagesearch.config.b.cZ()).a();
        }
    }

    public static boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue() : Build.VERSION.SDK_INT < 23 || ActivityCompat.checkSelfPermission(activity, com.taobao.speech.util.e.CAMERA) == 0;
    }
}
