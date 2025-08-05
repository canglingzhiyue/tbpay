package com.taobao.orange.accssupport;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.aranger.exception.IPCException;
import com.taobao.orange.e;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;
import tb.kge;

/* loaded from: classes7.dex */
public class a extends AccsAbstractDataListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.orange.accssupport.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class C0744a {

        /* renamed from: a  reason: collision with root package name */
        public long f18580a = 0;
        public long b = 0;
        public long c = 0;
        public long d = 0;

        static {
            kge.a(-347094911);
        }

        public C0744a() {
        }
    }

    static {
        kge.a(621921939);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ecc16f3e", new Object[]{aVar, str}) : aVar.a(str);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if (!"orange-dc".equals(str)) {
        } else {
            OLog.i("OrangeAccsListener", "onData", "dataId", str3, "userId", str2);
            a(str3, bArr);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            ACCSClient.getAccsClient().registerDataListener("orange-dc", new a());
        } catch (Throwable th) {
            OLog.e("OrangeAccsListener", "register", th, new Object[0]);
        }
    }

    private void a(final String str, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a7c79", new Object[]{this, str, bArr});
            return;
        }
        final C0744a c0744a = new C0744a();
        c0744a.f18580a = System.currentTimeMillis();
        e.a(new Runnable() { // from class: com.taobao.orange.accssupport.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[Catch: Throwable -> 0x00a8, TryCatch #0 {Throwable -> 0x00a8, blocks: (B:10:0x001e, B:13:0x0038, B:14:0x0040, B:16:0x0048, B:17:0x004e, B:22:0x006e, B:24:0x0078, B:26:0x009a, B:18:0x0052, B:20:0x005a, B:21:0x0061), top: B:37:0x001e }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 251
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.accssupport.a.AnonymousClass1.run():void");
            }
        });
    }

    private String a(String str) {
        int indexOf;
        int indexOf2;
        int i;
        int indexOf3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null || (indexOf = str.indexOf("\"type\":")) == -1 || (indexOf2 = str.indexOf(34, indexOf + 7)) == -1 || (indexOf3 = str.indexOf(34, (i = indexOf2 + 1))) == -1) {
            return null;
        }
        String substring = str.substring(i, indexOf3);
        if (!NameSpaceDO.TYPE_STANDARD.equals(substring) && !NameSpaceDO.TYPE_CUSTOM.equals(substring)) {
            return null;
        }
        return substring;
    }
}
