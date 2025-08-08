package com.taobao.mrt.task;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.android.alinnpython.AliNNPythonThreadState;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long b;
    public long c;
    public long d;
    public long e;
    public i f;
    public MRTTaskDescription g;
    public List h;
    private final Map<String, Map<String, Object>> i;
    private String j;
    private h l;
    private boolean m;
    private boolean k = false;

    /* renamed from: a  reason: collision with root package name */
    public long f18257a = System.currentTimeMillis();

    static {
        kge.a(1463538821);
    }

    public f(MRTTaskDescription mRTTaskDescription, i iVar, String str, List list, boolean z, h hVar, Map<String, Map<String, Object>> map) {
        this.f = null;
        this.g = null;
        this.j = null;
        this.h = null;
        this.m = false;
        this.f = iVar;
        this.g = mRTTaskDescription;
        this.j = str;
        this.h = list;
        this.l = hVar;
        this.m = z;
        long j = this.f18257a;
        this.b = j;
        this.c = j;
        this.d = j;
        this.e = j;
        this.i = map;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:26|(1:28)|(5:29|30|(1:32)(1:62)|33|34)|(2:36|(13:38|39|(1:41)|42|(2:44|45)(1:60)|46|47|(1:49)|50|51|(1:53)|54|55))|61|39|(0)|42|(0)(0)|46|47|(0)|50|51|(0)|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0222, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0226, code lost:
        com.taobao.mrt.utils.a.a("MRTJob", "execute failed", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d5 A[Catch: Exception -> 0x0224, TryCatch #0 {Exception -> 0x0224, blocks: (B:29:0x00ff, B:31:0x0103, B:33:0x0114, B:36:0x0124, B:38:0x0141, B:40:0x01a4, B:42:0x01d5, B:45:0x0208), top: B:63:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0208 A[Catch: Exception -> 0x0224, TRY_LEAVE, TryCatch #0 {Exception -> 0x0224, blocks: (B:29:0x00ff, B:31:0x0103, B:33:0x0114, B:36:0x0124, B:38:0x0141, B:40:0x01a4, B:42:0x01d5, B:45:0x0208), top: B:63:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0213 A[Catch: Exception -> 0x0222, TryCatch #1 {Exception -> 0x0222, blocks: (B:48:0x020f, B:50:0x0213, B:51:0x021e), top: B:65:0x020f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.android.alinnpython.AliNNPython r13) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mrt.task.f.a(com.taobao.android.alinnpython.AliNNPython):void");
    }

    private void a(int i, AliNNPythonThreadState aliNNPythonThreadState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd79151", new Object[]{this, new Integer(i), aliNNPythonThreadState});
            return;
        }
        long j = this.d;
        long j2 = this.c;
        long j3 = j - j2;
        long j4 = this.b;
        long j5 = j4 - this.f18257a;
        long j6 = j2 - j4;
        long j7 = this.e - j;
        int i2 = i == 0 ? 1 : 0;
        com.taobao.mrt.utils.c.a(aliNNPythonThreadState, this.g.name, "", this.g.cid, this.j, j3 > 10000 ? 153 : i, i2, 1 - i2, j5, j6, j3, j7, this.i);
    }

    private void a(i iVar, MRTRuntimeException mRTRuntimeException, Object obj) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8830e2e7", new Object[]{this, iVar, mRTRuntimeException, obj});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("任务 ");
        sb.append(this.g.name);
        sb.append(" 结果:");
        sb.append(mRTRuntimeException != null ? mRTRuntimeException : obj);
        com.taobao.mrt.utils.a.g("MRTJob", sb.toString());
        if (iVar == null) {
            return;
        }
        if (mRTRuntimeException != null) {
            i = mRTRuntimeException.errorCode;
        }
        iVar.onCompletion(i, mRTRuntimeException, obj);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.k = true;
        a(this.f, new MRTRuntimeException(1001, "Job is cancelled"), null);
    }

    public void a(String str, AliNNPython aliNNPython) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37b466f", new Object[]{this, str, aliNNPython});
        } else if (StringUtils.isEmpty(str) || aliNNPython == null) {
        } else {
            try {
                aliNNPython.reloadPackage(str);
            } catch (Exception e) {
                com.taobao.mrt.utils.a.a("MRTJob", "reloadPackage failed", e);
            }
        }
    }
}
