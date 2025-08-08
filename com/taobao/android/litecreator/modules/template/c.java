package com.taobao.android.litecreator.modules.template;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.support.v4.app.ActivityCompat;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.template.d;
import com.taobao.android.litecreator.util.an;
import com.taobao.android.litecreator.util.k;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.login4android.Login;
import com.taobao.runtimepermission.f;
import com.taobao.taobao.R;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static TBLocationDTO f13377a;
    private boolean d = false;
    private Set<String> b = new HashSet();
    private boolean c = false;

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(461156106);
    }

    public static /* synthetic */ Set a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a4badc6e", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ void a(c cVar, Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c15c441", new Object[]{cVar, context, aVar});
        } else {
            cVar.b(context, aVar);
        }
    }

    public void a(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{this, context, str, map});
        } else if (map == null) {
        } else {
            if (map.containsKey("key") && StringUtils.equals("avatar", map.get("key"))) {
                this.d = true;
            } else if (!map.containsKey("biz")) {
            } else {
                if (!map.containsValue("city") && !map.containsValue("longitude") && !map.containsValue("latitude")) {
                    return;
                }
                if (!TBLocationClient.c()) {
                    this.b.add(str);
                } else if (TBLocationClient.b() != null || this.c) {
                } else {
                    a(context, (a) null);
                    this.c = true;
                }
            }
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.b.contains(str);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b.remove(str);
        }
    }

    public void a(final Context context, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8e922a", new Object[]{this, context, aVar});
        } else if (TBLocationClient.c()) {
            b(context, aVar);
        } else {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (ActivityCompat.shouldShowRequestPermissionRationale(activity, com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION)) {
                    com.taobao.android.litecreator.util.b.a(activity);
                    return;
                }
            }
            f.a(context, new String[]{com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION}).a(com.alibaba.ability.localization.b.a(R.string.gg_pub_template_uses_location)).b(new Runnable() { // from class: com.taobao.android.litecreator.modules.template.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.b();
                }
            }).a(new Runnable() { // from class: com.taobao.android.litecreator.modules.template.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(c.this, context, aVar);
                    }
                }
            }).a(true).b("guangguang").a();
        }
    }

    private void b(Context context, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("830a6beb", new Object[]{this, context, aVar});
            return;
        }
        TBLocationOption tBLocationOption = new TBLocationOption();
        tBLocationOption.setTimeout(TBLocationOption.Timeout.FIVE_SECONDS);
        TBLocationClient.a(context).a(tBLocationOption, new com.taobao.location.client.a() { // from class: com.taobao.android.litecreator.modules.template.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.location.client.a
            public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                    return;
                }
                if (tBLocationDTO != null) {
                    c.f13377a = tBLocationDTO;
                    c.a(c.this).clear();
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                if (tBLocationDTO == null) {
                    aVar2.b();
                } else {
                    aVar2.a();
                }
            }
        }, (Looper) null);
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map == null) {
        } else {
            if (map.containsKey("key") && StringUtils.equals("avatar", map.get("key"))) {
                String b = an.b("user_avatar_path");
                if (!k.a(b)) {
                    return;
                }
                map.put("result", b);
            } else if (map.containsKey("key") && StringUtils.equals(map.get("key"), "user_name")) {
                map.put("result", Login.getDisplayNick());
            } else if (!map.containsValue("city") && !map.containsValue("longitude") && !map.containsValue("latitude")) {
            } else {
                TBLocationDTO tBLocationDTO = f13377a;
                if (tBLocationDTO == null) {
                    tBLocationDTO = TBLocationClient.b();
                }
                if (tBLocationDTO == null) {
                    return;
                }
                a(map, tBLocationDTO);
            }
        }
    }

    public void a(Context context, final d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd436ac9", new Object[]{this, context, aVar});
        } else {
            new d().a(context, new d.a() { // from class: com.taobao.android.litecreator.modules.template.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.litecreator.modules.template.d.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    an.a("user_avatar_path", str);
                    aVar.a(str);
                }

                @Override // com.taobao.android.litecreator.modules.template.d.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        aVar.a(str, str2);
                    }
                }
            });
        }
    }

    private static void a(Map<String, String> map, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15117d2d", new Object[]{map, tBLocationDTO});
        } else if (!map.containsKey("biz") || !StringUtils.equals(map.get("biz"), "str_value")) {
        } else {
            if (map.containsKey("key") && StringUtils.equals(map.get("key"), "city")) {
                map.put("result", tBLocationDTO.getCityName());
            } else if (map.containsKey("key") && StringUtils.equals(map.get("key"), "longitude")) {
                map.put("result", tBLocationDTO.getLongitude());
            } else if (!map.containsKey("key") || !StringUtils.equals(map.get("key"), "latitude")) {
            } else {
                map.put("result", tBLocationDTO.getLatitude());
            }
        }
    }
}
