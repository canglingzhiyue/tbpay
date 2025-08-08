package com.alibaba.ability.impl.contacts;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContactsResult;
import com.taobao.android.abilityidl.ability.bh;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes2.dex */
public final class c extends com.alibaba.ability.impl.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String[] PHONES_PROJECTION;
    public static final int REQUEST_CODE = 49354;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f1874a;
    private final bh b;

    public c(bh bhVar) {
        this.b = bhVar;
    }

    @Override // com.alibaba.ability.impl.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        q.d(activity, "activity");
        this.f1874a = new WeakReference<>(activity);
        try {
            activity.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI), REQUEST_CODE);
        } catch (Throwable th) {
            bh bhVar = this.b;
            if (bhVar == null) {
                return;
            }
            bhVar.a(new ErrorResult("UNKNOWN_ERROR", th.toString(), (Map) null, 4, (o) null));
        }
    }

    @Override // com.alibaba.ability.impl.c
    public void a(int i, int i2, Intent intent) {
        Activity activity;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WeakReference<Activity> weakReference = this.f1874a;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return;
        }
        q.b(activity, "mActivity?.get() ?: return");
        if (i == 49354 && i2 == -1) {
            Uri uri = null;
            if (intent != null && intent.getData() != null) {
                Uri data = intent.getData();
                if (data != null) {
                    uri = data;
                } else {
                    data = null;
                }
                if (data != null) {
                    if (uri == null || (str = uri.getLastPathSegment()) == null) {
                        str = "";
                    }
                    q.b(str, "contact?.lastPathSegment ?: \"\"");
                    if (!StringUtils.isEmpty(str)) {
                        List<com.alibaba.ability.impl.contacts.a> a2 = b.a(activity, str, null, null, this.b);
                        if (a2 != null) {
                            if (a2.isEmpty()) {
                                bh bhVar = this.b;
                                if (bhVar != null) {
                                    bhVar.a(new ErrorResult("UNKNOWN_ERROR", "查询到空数据", (Map) null, 4, (o) null));
                                }
                                activity.finish();
                                return;
                            }
                            com.alibaba.ability.impl.contacts.a aVar = a2.get(0);
                            String str2 = aVar.b;
                            if (str2 == null) {
                                str2 = "";
                            }
                            String str3 = aVar.f1873a;
                            if (str3 == null) {
                                str3 = "";
                            }
                            bh bhVar2 = this.b;
                            if (bhVar2 != null) {
                                ContactsResult contactsResult = new ContactsResult();
                                contactsResult.name = str3;
                                contactsResult.phone = str2;
                                t tVar = t.INSTANCE;
                                bhVar2.a(contactsResult);
                            }
                        } else {
                            bh bhVar3 = this.b;
                            if (bhVar3 != null) {
                                bhVar3.a(new ErrorResult("UNKNOWN_ERROR", "getContacts is null", (Map) null, 4, (o) null));
                            }
                        }
                    } else {
                        bh bhVar4 = this.b;
                        if (bhVar4 != null) {
                            bhVar4.a(new ErrorResult("UNKNOWN_ERROR", "contactId is null", (Map) null, 4, (o) null));
                        }
                    }
                }
            }
            bh bhVar5 = this.b;
            if (bhVar5 != null) {
                bhVar5.a(new ErrorResult("UNKNOWN_ERROR", "data == null", (Map) null, 4, (o) null));
            }
            activity.finish();
            return;
        }
        bh bhVar6 = this.b;
        if (bhVar6 != null) {
            bhVar6.a();
        }
        activity.finish();
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(826191545);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-430560079);
        Companion = new a(null);
        PHONES_PROJECTION = new String[]{"display_name", "data1"};
    }
}
