package com.android.taobao.safeclean;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.AdditionList;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import tb.cit;
import tb.ciu;
import tb.civ;
import tb.ciw;
import tb.ciy;
import tb.ciz;
import tb.dvq;
import tb.kge;
import tb.kna;

/* loaded from: classes3.dex */
public class l implements d<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ciu f6404a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final l f6405a;

        static {
            kge.a(-1248965105);
            f6405a = new l();
        }

        public static /* synthetic */ l a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("a9a57157", new Object[0]) : f6405a;
        }
    }

    static {
        kge.a(141751745);
        kge.a(-673478844);
    }

    private l() {
        this.f6404a = null;
        this.f6404a = new ciu(Arrays.asList(new cit(), new ciy(), new civ(), new ciw(), new ciz()));
    }

    public static l a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("a9a57157", new Object[0]) : a.a();
    }

    @Override // com.android.taobao.safeclean.d
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (!StringUtils.isEmpty(str3)) {
            try {
                AdditionList additionList = (AdditionList) JSON.parseObject(str3, AdditionList.class);
                Log.e("SimpleAdditioner", additionList.toString());
                if (!g.a().f().equals(additionList.appVersion)) {
                    Log.e("SimpleAdditioner", "appVersion is not match!");
                } else if (additionList.additionDataList.size() != 0) {
                    ArrayList<e> arrayList = new ArrayList();
                    for (AdditionList.AdditionModel additionModel : additionList.additionDataList) {
                        e eVar = new e();
                        File b = b(additionModel.type, additionModel.fileRoot, additionModel.fileLocation);
                        Log.e("SimpleAdditioner", "translate location to:" + b.getPath());
                        if (b != null && (!new File(b, additionModel.fileName).exists() || additionModel.overrideExit)) {
                            if (!new File(b, additionModel.fileName).exists() || !kna.a(additionModel.fileMD5, new File(b, additionModel.fileName).getAbsolutePath())) {
                                Log.e("SimpleAdditioner", "overide exited file:" + new File(b, additionModel.fileName).getPath());
                                if (!b.exists()) {
                                    b.mkdirs();
                                }
                                eVar.f6397a = additionModel.fileUrl;
                                eVar.g = b.getAbsolutePath();
                                eVar.c = additionModel.fileMD5;
                                eVar.h = additionModel.fileName;
                                eVar.b = additionModel.fileSize;
                                arrayList.add(eVar);
                            }
                        }
                    }
                    f.a().a(arrayList);
                    for (e eVar2 : arrayList) {
                        if (eVar2.d) {
                            j.a(eVar2.h);
                        } else {
                            j.a(eVar2.h, eVar2.e, eVar2.f);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private File b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("938acb66", new Object[]{this, str, str2, str3});
        }
        String a2 = a(str3);
        if (str.equals("internal")) {
            if (str2.equals(dvq.FILES_DIR_NAME)) {
                return new File(m.f6406a.getFilesDir(), a2);
            }
            if (str2.equals("cache")) {
                return new File(m.f6406a.getCacheDir(), a2);
            }
            return new File(m.f6406a.getDir(str2, 0), a2);
        } else if (!str.equals(UiUtil.INPUT_TYPE_VALUE_EXTERNAL)) {
            return null;
        } else {
            if (str2.equals(dvq.FILES_DIR_NAME)) {
                return new File(m.f6406a.getExternalFilesDir(null), a2);
            }
            if (str2.equals("cache")) {
                return new File(m.f6406a.getExternalCacheDir(), a2);
            }
            return new File(m.f6406a.getExternalCacheDir().getParentFile(), a2);
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.f6404a.a(str);
    }
}
