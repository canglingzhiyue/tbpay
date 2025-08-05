package com.ifaa.seccam;

import android.content.Context;
import android.os.RemoteException;
import android.os.SharedMemory;
import com.android.alibaba.ip.runtime.IpChange;
import com.ifaa.seccam.IFAASecCamCallback;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import org.json.JSONObject;
import tb.cyx;
import tb.cyy;
import tb.cyz;
import tb.cza;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static g d = new g();

    /* renamed from: a */
    public IFAASecCamInterface f7634a;
    private Context b;
    private cza c;

    public static /* synthetic */ cza a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cza) ipChange.ipc$dispatch("ebb6287d", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ void a(g gVar, byte[] bArr, cyz cyzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c15347d2", new Object[]{gVar, bArr, cyzVar});
        } else {
            gVar.b(bArr, cyzVar);
        }
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("8564e41f", new Object[0]) : d;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.b = context;
        }
    }

    public void a(final byte[] bArr, final cyz cyzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ab895b", new Object[]{this, bArr, cyzVar});
        } else if (h.a()) {
            f.a("SecCamManager", "init connected!");
            b(bArr, cyzVar);
        } else if (h.a(this.b, new cyx() { // from class: com.ifaa.seccam.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                g.this = this;
            }

            @Override // tb.cyx
            public void a(IFAASecCamInterface iFAASecCamInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("da2a7bc8", new Object[]{this, iFAASecCamInterface});
                } else if (iFAASecCamInterface != null) {
                    g.a(g.this, bArr, cyzVar);
                } else {
                    f.a("SecCamManager", "the connection is failed.");
                    cyzVar.a(101, null);
                }
            }
        })) {
        } else {
            f.a("SecCamManager", "the init connection is failed.");
            cyzVar.a(101, null);
        }
    }

    private void b(byte[] bArr, cyz cyzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e86f39c", new Object[]{this, bArr, cyzVar});
            return;
        }
        try {
            f.a("SecCamManager", "initCamStep2!");
            SharedMemory a2 = h.a(bArr);
            if (a2 == null) {
                return;
            }
            if (this.f7634a.initSecCam(a2) == 0) {
                cyzVar.a(100, h.a(a2));
            } else {
                cyzVar.a(102, null);
            }
        } catch (Exception e) {
            f.a("SecCamManager", "init error :: " + e.toString());
            cyzVar.a(102, null);
        }
    }

    public void a(int i, cza czaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8a94401", new Object[]{this, new Integer(i), czaVar});
            return;
        }
        try {
            this.c = czaVar;
            this.f7634a.openSecCam(i, new IFAASecCamCallback.Stub() { // from class: com.ifaa.seccam.SecCamManager$2
                @Override // com.ifaa.seccam.IFAASecCamCallback
                public void onFrameEvent(int i2, int i3) throws RemoteException {
                    if (i2 == 0) {
                        g.a(g.this).a(200, i3);
                    } else {
                        g.a(g.this).a(201, -1);
                    }
                }
            });
        } catch (Exception e) {
            f.a("SecCamManager", "open error :: " + e.toString());
            czaVar.a(202, -1);
        }
    }

    public c a(int i, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("514fe22d", new Object[]{this, new Integer(i), bArr, new Boolean(z)});
        }
        c cVar = new c();
        try {
            SharedMemory a2 = h.a(bArr);
            int secImg = this.f7634a.getSecImg(i, a2);
            f.a("SecCamManager", "CamImg code = " + secImg);
            if (secImg == 0) {
                byte[] a3 = h.a(a2);
                f.a("SecCamManager", "CamImg length = " + a3.length);
                cVar.a(a3);
                cVar.a(300);
                if (z && !h.a(cVar, a3)) {
                    f.a("SecCamManager", "CamImg imgAnalysis = ");
                    cVar.a(303);
                }
            } else {
                cVar.a(301);
            }
        } catch (Exception e) {
            f.a("SecCamManager", "get img error :: " + e.toString());
            cVar.a(302);
        }
        return cVar;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        try {
            f.a("SecCamManager", "closeCam start!");
            this.b = null;
            this.c = null;
            f.a("SecCamManager", "closeCam end!");
            return this.f7634a.closeSecCam();
        } catch (Exception e) {
            f.a("SecCamManager", "close error :: " + e.toString());
            return -1;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        try {
            return this.f7634a.getDeviceModel();
        } catch (Exception e) {
            f.a("SecCamManager", "get device model error :: " + e.toString());
            return null;
        }
    }

    public void a(final cyy cyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e465d135", new Object[]{this, cyyVar});
        } else if (h.a()) {
            f.a("SecCamManager", "device info connected!");
            b(cyyVar);
        } else if (h.a(this.b, new cyx() { // from class: com.ifaa.seccam.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                g.this = this;
            }

            @Override // tb.cyx
            public void a(IFAASecCamInterface iFAASecCamInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("da2a7bc8", new Object[]{this, iFAASecCamInterface});
                } else if (iFAASecCamInterface != null) {
                    g.this.b(cyyVar);
                } else {
                    f.a("SecCamManager", "the deviceinfo connection is failed.");
                    cyyVar.a(401, null);
                }
            }
        })) {
        } else {
            f.a("SecCamManager", "the init connection is failed.");
            cyyVar.a(401, null);
        }
    }

    public void b(cyy cyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e8d7b6", new Object[]{this, cyyVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", String.valueOf(this.f7634a.getVersion()));
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, this.f7634a.getDeviceModel());
            cyyVar.a(400, String.valueOf(jSONObject));
        } catch (Exception unused) {
            f.a("SecCamManager", "the deviceinfo connection is failed.");
            cyyVar.a(402, null);
        }
    }
}
