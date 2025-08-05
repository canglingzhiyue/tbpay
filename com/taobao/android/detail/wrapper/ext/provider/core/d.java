package com.taobao.android.detail.wrapper.ext.provider.core;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.bk;
import java.util.Map;
import tb.emu;
import tb.fbx;
import tb.kge;

/* loaded from: classes5.dex */
public class d implements fbx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1993192220);
        kge.a(-829543302);
    }

    public d() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.TBDWVideoProvider");
    }

    public DWInstance.a a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInstance.a) ipChange.ipc$dispatch("24965b20", new Object[]{this, activity}) : new bk.a(activity);
    }

    public fbx.a b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fbx.a) ipChange.ipc$dispatch("15f141d2", new Object[]{this, activity});
        }
        final com.taobao.android.interactive.timeline.a aVar = new com.taobao.android.interactive.timeline.a(activity);
        return new fbx.a() { // from class: com.taobao.android.detail.wrapper.ext.provider.core.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fbx.a
            public void a(DWInstance dWInstance, String str, String str2, String str3, boolean z, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a81f818", new Object[]{this, dWInstance, str, str2, str3, new Boolean(z), map});
                } else if (dWInstance == null || !(dWInstance instanceof bk)) {
                } else {
                    aVar.a((bk) dWInstance, str, str2, str3, z, map);
                }
            }

            @Override // tb.fbx.a
            public View a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("195fbaaa", new Object[]{this});
                }
                com.taobao.android.interactive.timeline.a aVar2 = aVar;
                if (aVar2 == null) {
                    return null;
                }
                return aVar2.a();
            }

            @Override // tb.fbx.a
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    aVar.a(view);
                }
            }

            @Override // tb.fbx.a
            public void a(final fbx.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d64b1f9e", new Object[]{this, bVar});
                    return;
                }
                aVar.a(new com.taobao.android.interactive.timeline.c() { // from class: com.taobao.android.detail.wrapper.ext.provider.core.d.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void a(int i, int i2) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                        } else {
                            bVar.a(i, i2);
                        }
                    }
                });
                aVar.a(new com.taobao.android.interactive.timeline.b() { // from class: com.taobao.android.detail.wrapper.ext.provider.core.d.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void onProgressChangedListener(int i, int i2, int i3) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("52350080", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                        } else {
                            bVar.a(i, i2, i3);
                        }
                    }
                });
                aVar.a(new com.taobao.android.interactive.timeline.d() { // from class: com.taobao.android.detail.wrapper.ext.provider.core.d.1.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void a() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            bVar.a();
                        }
                    }
                });
            }

            @Override // tb.fbx.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    aVar.b();
                }
            }

            @Override // tb.fbx.a
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                } else {
                    aVar.c();
                }
            }

            @Override // tb.fbx.a
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                } else {
                    aVar.d();
                }
            }
        };
    }
}
