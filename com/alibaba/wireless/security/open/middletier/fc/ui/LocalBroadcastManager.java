package com.alibaba.wireless.security.open.middletier.fc.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.alibaba.security.realidentity.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public final class LocalBroadcastManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object f;
    private static LocalBroadcastManager g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4321a;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> b = new HashMap<>();
    private final HashMap<String, ArrayList<ReceiverRecord>> c = new HashMap<>();
    private final ArrayList<BroadcastRecord> d = new ArrayList<>();
    private final Handler e;

    /* loaded from: classes3.dex */
    public static class BroadcastRecord {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f4323a;
        public final ArrayList<ReceiverRecord> b;

        static {
            kge.a(-672532758);
        }

        public BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.f4323a = intent;
            this.b = arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static class ReceiverRecord {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f4324a;
        public final BroadcastReceiver b;
        public boolean c;

        static {
            kge.a(-2080990808);
        }

        public ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f4324a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.f4324a);
            sb.append(riy.BLOCK_END_STR);
            return sb.toString();
        }
    }

    static {
        kge.a(-1671424196);
        f = new Object();
    }

    private LocalBroadcastManager(Context context) {
        this.f4321a = context;
        this.e = new Handler(context.getMainLooper()) { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.LocalBroadcastManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 673877017) {
                    super.handleMessage((Message) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    LocalBroadcastManager.a(LocalBroadcastManager.this);
                }
            }
        };
    }

    private void a() {
        BroadcastRecord[] broadcastRecordArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        while (true) {
            synchronized (this.b) {
                int size = this.d.size();
                if (size <= 0) {
                    return;
                }
                broadcastRecordArr = new BroadcastRecord[size];
                this.d.toArray(broadcastRecordArr);
                this.d.clear();
            }
            for (BroadcastRecord broadcastRecord : broadcastRecordArr) {
                for (int i = 0; i < broadcastRecord.b.size(); i++) {
                    broadcastRecord.b.get(i).b.onReceive(this.f4321a, broadcastRecord.f4323a);
                }
            }
        }
    }

    public static /* synthetic */ void a(LocalBroadcastManager localBroadcastManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a45425d", new Object[]{localBroadcastManager});
        } else {
            localBroadcastManager.a();
        }
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalBroadcastManager) ipChange.ipc$dispatch("7829e46b", new Object[]{context});
        }
        synchronized (f) {
            if (g == null) {
                g = new LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = g;
        }
        return localBroadcastManager;
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef98653", new Object[]{this, broadcastReceiver, intentFilter});
            return;
        }
        synchronized (this.b) {
            ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList<IntentFilter> arrayList = this.b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<ReceiverRecord> arrayList2 = this.c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.c.put(action, arrayList2);
                }
                arrayList2.add(receiverRecord);
            }
        }
    }

    public boolean sendBroadcast(Intent intent) {
        ArrayList arrayList;
        int i;
        ArrayList<ReceiverRecord> arrayList2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("798729e1", new Object[]{this, intent})).booleanValue();
        }
        synchronized (this.b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f4321a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                String str = "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent;
            }
            ArrayList<ReceiverRecord> arrayList3 = this.c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    String str2 = "Action list: " + arrayList3;
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    ReceiverRecord receiverRecord = arrayList3.get(i2);
                    if (z) {
                        String str3 = "Matching against filter " + receiverRecord.f4324a;
                    }
                    if (receiverRecord.c) {
                        arrayList = arrayList4;
                        i = i2;
                        arrayList2 = arrayList3;
                    } else {
                        arrayList = arrayList4;
                        i = i2;
                        arrayList2 = arrayList3;
                        int match = receiverRecord.f4324a.match(action, resolveTypeIfNeeded, scheme, data, categories, h.f);
                        if (match >= 0) {
                            if (z) {
                                String str4 = "  Filter matched!  match=0x" + Integer.toHexString(match);
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(receiverRecord);
                            receiverRecord.c = true;
                        } else if (z) {
                            String str5 = "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category");
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    arrayList3 = arrayList2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((ReceiverRecord) arrayList5.get(i3)).c = false;
                    }
                    this.d.add(new BroadcastRecord(intent, arrayList5));
                    if (!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void sendBroadcastSync(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b24ad98", new Object[]{this, intent});
        } else if (!sendBroadcast(intent)) {
        } else {
            a();
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdcb6b5", new Object[]{this, broadcastReceiver});
            return;
        }
        synchronized (this.b) {
            ArrayList<IntentFilter> remove = this.b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int i = 0; i < remove.size(); i++) {
                IntentFilter intentFilter = remove.get(i);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList<ReceiverRecord> arrayList = this.c.get(action);
                    if (arrayList != null) {
                        int i3 = 0;
                        while (i3 < arrayList.size()) {
                            if (arrayList.get(i3).b == broadcastReceiver) {
                                arrayList.remove(i3);
                                i3--;
                            }
                            i3++;
                        }
                        if (arrayList.size() <= 0) {
                            this.c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
