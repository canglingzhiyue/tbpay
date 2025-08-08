package com.taobao.tinct.impl.collect;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final File f22950a;
    private final Context b;

    public c(Context context) {
        File file;
        File file2 = new File(context.getFilesDir(), "tinct");
        int k = com.taobao.tinct.impl.config.a.k();
        if (k == 1) {
            file = new File(file2, "pre");
        } else {
            file = k != 2 ? file2 : new File(file2, "test");
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.b = context;
        this.f22950a = new File(file, String.format("%s-%s", com.taobao.tinct.impl.config.a.l(), "tinct.history"));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.tinct.impl.collect.ChangeRecord a() {
        /*
            r14 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tinct.impl.collect.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r14
            java.lang.String r2 = "d87052c0"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            com.taobao.tinct.impl.collect.ChangeRecord r0 = (com.taobao.tinct.impl.collect.ChangeRecord) r0
            return r0
        L15:
            r0 = 0
            java.io.File r1 = r14.f22950a
            boolean r1 = r1.exists()
            r4 = 2
            if (r1 == 0) goto L7c
            java.lang.String r1 = r14.d()
            boolean r5 = android.text.StringUtils.isEmpty(r1)
            if (r5 != 0) goto L7c
            java.lang.Class<com.taobao.tinct.impl.collect.ChangeRecord> r5 = com.taobao.tinct.impl.collect.ChangeRecord.class
            java.lang.Object r1 = com.alibaba.fastjson.JSON.parseObject(r1, r5)     // Catch: java.lang.Exception -> L74
            com.taobao.tinct.impl.collect.ChangeRecord r1 = (com.taobao.tinct.impl.collect.ChangeRecord) r1     // Catch: java.lang.Exception -> L74
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L72
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.taobao.tinct.model.OrangeChangeInfo> r0 = r1.orangeChangeMap     // Catch: java.lang.Exception -> L72
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Exception -> L72
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L72
        L3f:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Exception -> L72
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Exception -> L72
            com.taobao.tinct.model.OrangeChangeInfo r7 = (com.taobao.tinct.model.OrangeChangeInfo) r7     // Catch: java.lang.Exception -> L72
            int r8 = r7.getStatus()     // Catch: java.lang.Exception -> L72
            if (r8 != r3) goto L5a
            boolean r8 = r7.isExpire()     // Catch: java.lang.Exception -> L72
            if (r8 == 0) goto L5a
            r7.setStatus(r4)     // Catch: java.lang.Exception -> L72
        L5a:
            boolean r8 = r7.isGray()     // Catch: java.lang.Exception -> L72
            if (r8 == 0) goto L3f
            long r8 = r7.getUpdateTime()     // Catch: java.lang.Exception -> L72
            long r8 = r5 - r8
            long r10 = com.taobao.tinct.impl.config.a.i()     // Catch: java.lang.Exception -> L72
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L3f
            r7.setGray(r2)     // Catch: java.lang.Exception -> L72
            goto L3f
        L72:
            r0 = move-exception
            goto L78
        L74:
            r1 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
        L78:
            r0.printStackTrace()
            goto L7d
        L7c:
            r1 = r0
        L7d:
            if (r1 != 0) goto L84
            com.taobao.tinct.impl.collect.ChangeRecord r1 = new com.taobao.tinct.impl.collect.ChangeRecord
            r1.<init>()
        L84:
            com.taobao.tinct.model.InstantPatchChangeInfo r0 = r14.b()
            r1.instantPatchInfo = r0
            com.taobao.tinct.model.b r0 = r14.c()
            r1.inlinePatchInfo = r0
            boolean r0 = com.taobao.tinct.impl.config.a.o()
            java.lang.String r5 = "ChangeDataManager"
            if (r0 == 0) goto Lc4
            com.taobao.tinct.model.a r0 = new com.taobao.tinct.model.a
            r0.<init>()
            android.content.Context r6 = r14.b
            r0.a(r6)
            r1.dynamicChangeInfo = r0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            boolean r6 = r0.a()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4[r2] = r6
            boolean r0 = r0.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4[r3] = r0
            java.lang.String r0 = "dynamic change: %b, isBeta: %b"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            android.util.Log.e(r5, r0)
            goto Lc9
        Lc4:
            java.lang.String r0 = "dynamic change is disable"
            android.util.Log.e(r5, r0)
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tinct.impl.collect.c.a():com.taobao.tinct.impl.collect.ChangeRecord");
    }

    public InstantPatchChangeInfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstantPatchChangeInfo) ipChange.ipc$dispatch("3924bf17", new Object[]{this});
        }
        String patchVersion = InstantPatchChangeInfo.getPatchVersion(this.b);
        String patchType = InstantPatchChangeInfo.getPatchType(this.b);
        if (StringUtils.isEmpty(patchVersion)) {
            return null;
        }
        return new InstantPatchChangeInfo(patchVersion, patchType);
    }

    public com.taobao.tinct.model.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tinct.model.b) ipChange.ipc$dispatch("4f84cbf7", new Object[]{this});
        }
        String a2 = com.taobao.tinct.model.b.a(this.b);
        String b = com.taobao.tinct.model.b.b(this.b);
        if (StringUtils.isEmpty(a2)) {
            return null;
        }
        return new com.taobao.tinct.model.b(a2, b);
    }

    public void a(ChangeRecord changeRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba0e097a", new Object[]{this, changeRecord});
        } else if (changeRecord == null) {
        } else {
            a(JSON.toJSONString(changeRecord));
        }
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f22950a);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return sb.toString();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f22950a);
                FileChannel channel = fileOutputStream.getChannel();
                channel.write(Charset.forName("utf8").encode(str));
                if (channel != null) {
                    channel.close();
                }
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
