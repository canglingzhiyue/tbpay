package com.taobao.android.editionswitcher;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class EditionSwitcherActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f12247a;
    private com.taobao.android.editionswitcher.homepage.EditionListAdapter b;
    private com.taobao.android.editionswitcher.homepage.a c;

    static {
        kge.a(-1115229909);
    }

    public static /* synthetic */ Object ipc$super(EditionSwitcherActivity editionSwitcherActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public static /* synthetic */ com.taobao.android.editionswitcher.homepage.EditionListAdapter a(EditionSwitcherActivity editionSwitcherActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.editionswitcher.homepage.EditionListAdapter) ipChange.ipc$dispatch("5c230a8", new Object[]{editionSwitcherActivity}) : editionSwitcherActivity.b;
    }

    public static /* synthetic */ void a(EditionSwitcherActivity editionSwitcherActivity, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454cfe86", new Object[]{editionSwitcherActivity, context, str});
        } else {
            editionSwitcherActivity.a(context, str);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_area_switch);
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ((TextView) findViewById(R.id.activity_btn_change_area_confirm)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.editionswitcher.EditionSwitcherActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                com.taobao.android.editionswitcher.homepage.a checkedAreaItem = EditionSwitcherActivity.a(EditionSwitcherActivity.this).getCheckedAreaItem();
                if (checkedAreaItem == null) {
                    EditionSwitcherActivity.this.finish();
                } else {
                    EditionSwitcherActivity.a(EditionSwitcherActivity.this, view.getContext(), checkedAreaItem.f12297a);
                }
            }
        });
        c();
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f12247a = (TextView) findViewById(R.id.textview_change_area_current);
        this.f12247a.setText(String.format(getResources().getString(R.string.area_switch_current_country), this.c.c));
    }

    public void c() {
        com.taobao.android.editionswitcher.homepage.a aVar;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ListView listView = (ListView) findViewById(R.id.activity_listView_areas);
        LinkedHashMap<String, PositionInfo> a2 = d.a();
        ArrayList arrayList = new ArrayList();
        for (String str : a2.keySet()) {
            if (!TextUtils.equals(str, "CUN") && !TextUtils.equals(str, "OLD")) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        String str2 = b.b(getActivity()).countryCode;
        boolean z = false;
        for (int i2 : com.taobao.android.editionswitcher.homepage.c.a((String[]) arrayList.toArray(new String[0]), str2, b.c(getActivity()).countryCode)) {
            com.taobao.android.editionswitcher.homepage.a aVar2 = new com.taobao.android.editionswitcher.homepage.a();
            String trim = ((String) arrayList.get(i2)).trim();
            aVar2.f12297a = trim;
            aVar2.b = a2.get(trim).countryName;
            aVar2.c = aVar2.b;
            if (trim.equalsIgnoreCase(str2)) {
                aVar2.d = true;
                this.c = aVar2;
                z = true;
            } else {
                aVar2.d = false;
            }
            arrayList2.add(aVar2);
        }
        if (!z) {
            while (true) {
                int i3 = i + 1;
                aVar = (com.taobao.android.editionswitcher.homepage.a) arrayList2.get(i);
                if (!TextUtils.isEmpty(aVar.f12297a)) {
                    break;
                }
                i = i3;
            }
            aVar.d = true;
            this.c = aVar;
        }
        this.b = new com.taobao.android.editionswitcher.homepage.EditionListAdapter(arrayList2, 2);
        listView.setAdapter((ListAdapter) this.b);
        listView.setOnItemClickListener(this.b);
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        b.b(context, str);
        d();
        finish();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            TBS.Ext.commitEvent("Page_RegionSelect", 2101, "button-setting-select", null, null, "area=" + b.b(getActivity()).editionCode);
            com.taobao.android.behavix.h.a("Page_RegionSelect", "button-setting-select_BehaviX_UT", (String) null, (String) null, "area=" + b.b(getActivity()).editionCode);
        } catch (Exception unused) {
        }
    }
}
