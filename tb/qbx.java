package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.jni.ResourceJniInteract;
import com.taobao.taopai.material.request.base.d;
import com.taobao.taopai.material.request.materialfile.a;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes8.dex */
public class qbx implements qbv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<WeakReference<d>> f32894a = new ArrayList();

    static {
        kge.a(387485636);
        kge.a(-360548391);
    }

    public static /* synthetic */ List a(qbx qbxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("41ff9936", new Object[]{qbxVar}) : qbxVar.b();
    }

    public static /* synthetic */ void a(qbx qbxVar, MaterialDetailBean materialDetailBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214caaee", new Object[]{qbxVar, materialDetailBean});
        } else {
            qbxVar.a(materialDetailBean);
        }
    }

    public static /* synthetic */ void a(qbx qbxVar, MaterialDetailBean materialDetailBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2623538", new Object[]{qbxVar, materialDetailBean, str});
        } else {
            qbxVar.a(materialDetailBean, str);
        }
    }

    public static /* synthetic */ void a(qbx qbxVar, List list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d078b32", new Object[]{qbxVar, list, new Boolean(z)});
        } else {
            qbxVar.a(list, z);
        }
    }

    @Override // tb.qbv
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        long a2 = pyz.a(context, pyz.KEY_RESOURCE_CHECK_TIME);
        if (a2 > 0 && System.currentTimeMillis() - a2 < izg.a(86400000L)) {
            return;
        }
        pyz.a(context, pyz.KEY_RESOURCE_CHECK_TIME, System.currentTimeMillis());
        a(pzb.g(), false);
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            pzc.a(new Runnable() { // from class: tb.qbx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AsyncTask.SERIAL_EXECUTOR.execute(new Runnable() { // from class: tb.qbx.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    qbx.a(qbx.this, qbx.a(qbx.this), true);
                                }
                            }
                        });
                    }
                }
            }, 5000L);
        }
    }

    private void a(List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
        } else if (list != null && list.size() != 0) {
            for (final String str : list) {
                if (z || TextUtils.isEmpty(ResourceJniInteract.getResourceFromCacheWithIdOrTag(str))) {
                    com.taobao.taopai.material.maires.d.a(str, new qbt<MaterialDetailBean>() { // from class: tb.qbx.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.qbt
                        public void a(MaterialDetailBean materialDetailBean) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7f215f65", new Object[]{this, materialDetailBean});
                            } else {
                                qbx.a(qbx.this, materialDetailBean, str);
                            }
                        }

                        @Override // tb.qbu
                        public void a(String str2, String str3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                                return;
                            }
                            Log.e("ResourcePreloadProvider", "request url fail " + str2 + "|" + str3);
                        }
                    });
                }
            }
        }
    }

    private List<String> b() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String a2 = qbs.a();
        if (a2 != null && new File(a2).exists() && (listFiles = new File(a2).listFiles()) != null) {
            for (File file : listFiles) {
                arrayList.add(file.getName());
            }
        }
        String str = "local resource count = " + arrayList.size();
        return arrayList;
    }

    private void a(final MaterialDetailBean materialDetailBean, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2559ef", new Object[]{this, materialDetailBean, str});
        } else if (com.taobao.taopai.material.maires.d.a(str, materialDetailBean.resourceUrl)) {
            String str2 = "Material resource tag " + str + "is not update ,cache ready";
        } else {
            this.f32894a.add(new WeakReference<>(new d(materialDetailBean.resourceUrl, com.taobao.taopai.material.maires.d.a(str, materialDetailBean, new a() { // from class: tb.qbx.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taopai.material.request.materialfile.a
                public void a(String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                        return;
                    }
                    String str5 = "Material resource tag " + str + " download success, " + str4;
                    qbx.a(qbx.this, materialDetailBean);
                }

                @Override // com.taobao.taopai.material.request.materialfile.a
                public void a(String str3, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8123ad11", new Object[]{this, str3, new Integer(i)});
                        return;
                    }
                    String str4 = "tag = " + str + " download progress = " + i;
                }

                @Override // com.taobao.taopai.material.request.materialfile.a
                public void a(String str3, String str4, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("929ad046", new Object[]{this, str3, str4, str5});
                        return;
                    }
                    String str6 = "Material resource tag " + str + " download fail " + str4 + " | " + str5;
                    qbx.a(qbx.this, materialDetailBean);
                }
            }))));
        }
    }

    private void a(MaterialDetailBean materialDetailBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f215f65", new Object[]{this, materialDetailBean});
            return;
        }
        ListIterator<WeakReference<d>> listIterator = this.f32894a.listIterator();
        while (listIterator.hasNext()) {
            WeakReference<d> next = listIterator.next();
            if (next.get() != null && TextUtils.equals(next.get().f22074a, materialDetailBean.resourceUrl)) {
                listIterator.remove();
                return;
            }
        }
    }
}
