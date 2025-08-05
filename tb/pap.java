package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.d;
import com.uploader.export.e;
import com.uploader.export.i;
import com.uploader.export.j;
import com.uploader.export.l;
import java.util.Map;

/* loaded from: classes8.dex */
public class pap implements poe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1993879572);
        kge.a(-477832918);
    }

    @Override // tb.poe
    public void a(final pof pofVar, final poh pohVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751c8ce8", new Object[]{this, pofVar, pohVar, handler});
        } else {
            l.a().uploadAsync(new i() { // from class: tb.pap.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uploader.export.i
                public String getBizType() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9c07dca2", new Object[]{this}) : pofVar.a();
                }

                @Override // com.uploader.export.i
                public String getFilePath() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1bcb7a22", new Object[]{this}) : pofVar.b();
                }

                @Override // com.uploader.export.i
                public String getFileType() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("105a7e2d", new Object[]{this}) : pofVar.c();
                }

                @Override // com.uploader.export.i
                public Map<String, String> getMetaInfo() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Map) ipChange2.ipc$dispatch("8d01c005", new Object[]{this}) : pofVar.d();
                }
            }, new d() { // from class: tb.pap.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uploader.export.d
                public void onPause(i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88a48f02", new Object[]{this, iVar});
                    }
                }

                @Override // com.uploader.export.d
                public void onProgress(i iVar, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
                    }
                }

                @Override // com.uploader.export.d
                public void onResume(i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
                    }
                }

                @Override // com.uploader.export.d
                public void onStart(i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
                    }
                }

                @Override // com.uploader.export.d
                public void onWait(i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1be90445", new Object[]{this, iVar});
                    }
                }

                @Override // com.uploader.export.d
                public void onSuccess(i iVar, final e eVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                    } else {
                        pohVar.a(pofVar, new poi() { // from class: tb.pap.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.poi
                            public String a() {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("aff6e538", new Object[]{this}) : eVar.b();
                            }
                        });
                    }
                }

                @Override // com.uploader.export.d
                public void onFailure(i iVar, final j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
                    } else {
                        pohVar.a(pofVar, new pog() { // from class: tb.pap.2.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.pog
                            public String a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (String) ipChange3.ipc$dispatch("aff6e538", new Object[]{this});
                                }
                                j jVar2 = jVar;
                                if (jVar2 == null) {
                                    return null;
                                }
                                return jVar2.f24058a;
                            }

                            @Override // tb.pog
                            public String b() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (String) ipChange3.ipc$dispatch("367c9fd7", new Object[]{this});
                                }
                                j jVar2 = jVar;
                                if (jVar2 == null) {
                                    return null;
                                }
                                return jVar2.b;
                            }

                            @Override // tb.pog
                            public String c() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (String) ipChange3.ipc$dispatch("bd025a76", new Object[]{this});
                                }
                                j jVar2 = jVar;
                                if (jVar2 == null) {
                                    return null;
                                }
                                return jVar2.c;
                            }
                        });
                    }
                }

                @Override // com.uploader.export.d
                public void onCancel(i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("227e67e0", new Object[]{this, iVar});
                    } else {
                        pohVar.a(pofVar);
                    }
                }
            }, handler);
        }
    }
}
