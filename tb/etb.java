package tb;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.arflow.ARTryViewContainer;
import com.taobao.android.artry.resource.e;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class etb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ARTryViewContainer f27552a;
    private a b;

    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z, String str, String str2);
    }

    static {
        kge.a(2070495758);
    }

    public static /* synthetic */ a a(etb etbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("73eb3571", new Object[]{etbVar}) : etbVar.b;
    }

    public void a(ARTryViewContainer aRTryViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f811418d", new Object[]{this, aRTryViewContainer});
        } else {
            this.f27552a = aRTryViewContainer;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f0b48", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ARTryViewContainer aRTryViewContainer = this.f27552a;
        if (aRTryViewContainer == null) {
            return;
        }
        final Context context = aRTryViewContainer.getContext();
        this.f27552a.takePicture(new dpx() { // from class: tb.etb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dpx
            public void a(boolean z, JSONObject jSONObject) {
                Thread thread;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
                } else if (!z || jSONObject.getJSONObject("extra") == null || jSONObject.getJSONObject("extra").getJSONObject("snapshotInfo") == null) {
                    etb.a(etb.this).a(false, "internalError", null);
                } else {
                    final String string = jSONObject.getJSONObject("extra").getJSONObject("snapshotInfo").getString("frame_uri");
                    try {
                        if (TextUtils.isEmpty(string)) {
                            return;
                        }
                        try {
                            List<e> a2 = etc.a(str, context, Collections.singletonMap("capture", BitmapFactory.decodeFile(string)));
                            if (etb.a(etb.this) != null) {
                                if (a2 == null || a2.size() <= 0 || !a2.get(0).b()) {
                                    etb.a(etb.this).a(false, "ARMakeupView#UploadError", "");
                                } else {
                                    etb.a(etb.this).a(true, a2.get(0).a(), a2.get(0).d());
                                }
                            }
                            thread = new Thread(new Runnable() { // from class: tb.etb.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        etc.a(string);
                                    }
                                }
                            });
                        } catch (Exception e) {
                            e.printStackTrace();
                            etb.a(etb.this).a(false, Log.getStackTraceString(e), null);
                            thread = new Thread(new Runnable() { // from class: tb.etb.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        etc.a(string);
                                    }
                                }
                            });
                        }
                        thread.start();
                    } catch (Throwable th) {
                        new Thread(new Runnable() { // from class: tb.etb.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    etc.a(string);
                                }
                            }
                        }).start();
                        throw th;
                    }
                }
            }
        });
    }
}
