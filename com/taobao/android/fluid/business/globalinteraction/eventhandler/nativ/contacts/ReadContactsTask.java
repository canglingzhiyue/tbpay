package com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.contacts;

import android.content.Context;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.regex.Pattern;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class ReadContactsTask extends AsyncTask<Void, Void, ContactsModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MAX_PHONE_NUMBER = "maxPhoneNumber";

    /* renamed from: a  reason: collision with root package name */
    private static final String f12390a;
    private WeakReference<Context> b;
    private int c;
    private a d;

    /* loaded from: classes5.dex */
    public interface a {
        void a(ContactsModel contactsModel);
    }

    public static /* synthetic */ Object ipc$super(ReadContactsTask readContactsTask, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1325021319) {
            super.onPostExecute(objArr[0]);
            return null;
        } else if (hashCode == -886319787) {
            super.onCancelled(objArr[0]);
            return null;
        } else if (hashCode != 566591929) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCancelled();
            return null;
        }
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f12390a;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.contacts.ReadContactsTask$ContactsModel, java.lang.Object] */
    @Override // android.os.AsyncTask
    public /* synthetic */ ContactsModel doInBackground(Void[] voidArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onCancelled(ContactsModel contactsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2bd555", new Object[]{this, contactsModel});
        } else {
            b(contactsModel);
        }
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(ContactsModel contactsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, contactsModel});
        } else {
            a(contactsModel);
        }
    }

    static {
        kge.a(331020449);
        f12390a = ReadContactsTask.class.getSimpleName();
    }

    public ReadContactsTask(Context context, int i, a aVar) {
        if (context == null) {
            spz.c(f12390a, "【ReadContactsTask】context is null");
            return;
        }
        this.b = new WeakReference<>(context.getApplicationContext());
        this.c = i;
        this.d = aVar;
    }

    public ContactsModel a(Void... voidArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContactsModel) ipChange.ipc$dispatch("5cb8625e", new Object[]{this, voidArr});
        }
        spz.c(f12390a, "【doInBackground-getLocalContacts】start");
        Context context = this.b.get();
        if (context == null) {
            spz.c(f12390a, "【doInBackground-getLocalContacts】context is null");
            return null;
        }
        return a(context);
    }

    public void a(ContactsModel contactsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3952484", new Object[]{this, contactsModel});
            return;
        }
        super.onPostExecute(contactsModel);
        spz.c(f12390a, "【onPostExecute-getLocalContacts】start");
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(contactsModel);
        }
        this.b = null;
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c581b9", new Object[]{this});
        } else {
            super.onCancelled();
        }
    }

    public void b(ContactsModel contactsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0434e05", new Object[]{this, contactsModel});
        } else {
            super.onCancelled(contactsModel);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.contacts.ReadContactsTask.ContactsModel a(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.contacts.ReadContactsTask.a(android.content.Context):com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.contacts.ReadContactsTask$ContactsModel");
    }

    private String a(String str) {
        String replaceAll;
        char[] charArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            replaceAll = str.replaceAll(" ", "");
        } catch (Exception e) {
            spz.c(f12390a, "【getRealPhoneNumber】phoneNumber: " + str + ", error: " + e.toString());
        }
        if (replaceAll.length() < 11) {
            return null;
        }
        if (replaceAll.length() == 11) {
            if (b(replaceAll)) {
                return replaceAll;
            }
        } else {
            if (replaceAll.startsWith("+86")) {
                replaceAll = replaceAll.substring(3);
            }
            StringBuilder sb = new StringBuilder();
            for (char c : replaceAll.toCharArray()) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
            }
            if (sb.length() == 11) {
                String sb2 = sb.toString();
                if (b(sb2)) {
                    return sb2;
                }
            }
        }
        return null;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : Pattern.compile("^1[3-9]\\d{9}$").matcher(str).matches();
    }

    /* loaded from: classes5.dex */
    public static class ContactsModel implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String KEY_PHONE_NUMBERS = "phoneNumbers";
        private static final String KEY_STATUS = "status";
        public static final String STATUS_FAIL = "fail";
        public static final String STATUS_SUCCESS = "success";
        public List<String> phoneNumbers;
        public String status;

        static {
            kge.a(1681406899);
            kge.a(1028243835);
        }

        public JSONObject toJSONObject() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("e5b411a9", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", (Object) this.status);
                jSONObject.put(KEY_PHONE_NUMBERS, (Object) this.phoneNumbers);
            } catch (Throwable th) {
                String a2 = ReadContactsTask.a();
                spz.c(a2, "【toJSONObject】error: " + th.toString());
            }
            return jSONObject;
        }

        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            try {
                return JSON.toJSONString(this);
            } catch (Throwable th) {
                String a2 = ReadContactsTask.a();
                spz.c(a2, "【toJSONString】error: " + th.toString());
                return "";
            }
        }
    }
}
