package com.taobao.taobao.scancode.express.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.kakalib.express.ExpressResult;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.huoyan.ui.KakaLibBaseFragmentPage;
import tb.kge;
import tb.oys;

/* loaded from: classes8.dex */
public class ScancodeExpressFragment extends KakaLibBaseFragmentPage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ExpressSectionsAdapter mAdapter;
    private ExpressResult.ExpressSection[] mSections;

    static {
        kge.a(-1126897844);
    }

    public static /* synthetic */ Object ipc$super(ScancodeExpressFragment scancodeExpressFragment, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ExpressResult.ExpressSection[] access$000(ScancodeExpressFragment scancodeExpressFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExpressResult.ExpressSection[]) ipChange.ipc$dispatch("82a7fe9f", new Object[]{scancodeExpressFragment}) : scancodeExpressFragment.mSections;
    }

    @Override // com.taobao.taobao.scancode.huoyan.ui.KakaLibBaseFragmentPage, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setPageName("Page_FastMail_Info");
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.kakalib_activity_express, (ViewGroup) null, false);
        Intent intent = getActivity().getIntent();
        Parcelable[] parcelableArrayExtra = getActivity().getIntent().getParcelableArrayExtra(AbsListWidgetInstance.SLOT_SECTION);
        if (parcelableArrayExtra != null && parcelableArrayExtra.length > 0) {
            this.mSections = new ExpressResult.ExpressSection[parcelableArrayExtra.length];
            System.arraycopy(parcelableArrayExtra, 0, this.mSections, 0, parcelableArrayExtra.length);
        }
        String stringExtra = intent.getStringExtra("company");
        String stringExtra2 = intent.getStringExtra("expressno");
        ListView listView = (ListView) inflate.findViewById(R.id.activity_express_sections);
        this.mAdapter = new ExpressSectionsAdapter(getActivity());
        View inflate2 = LayoutInflater.from(getActivity()).inflate(R.layout.kakalib_express_header, (ViewGroup) null);
        ((TextView) inflate2.findViewById(R.id.activity_express_company)).setText(stringExtra);
        ((TextView) inflate2.findViewById(R.id.activity_express_no)).setText(getActivity().getResources().getString(R.string.kakalib_express_no) + ":    " + stringExtra2);
        listView.addHeaderView(inflate2, null, false);
        listView.setHeaderDividersEnabled(false);
        listView.setAdapter((ListAdapter) this.mAdapter);
        this.mAdapter.notifyDataSetChanged();
        oys.a().a("Express_UI_detail_fragment");
        return inflate;
    }

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f21249a;
        public TextView b;
        public TextView c;

        static {
            kge.a(56264181);
        }

        private a() {
        }
    }

    /* loaded from: classes8.dex */
    public class ExpressSectionsAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private LayoutInflater mInflater;

        static {
            kge.a(1686004777);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public ExpressSectionsAdapter(Context context) {
            this.mInflater = LayoutInflater.from(context);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (ScancodeExpressFragment.access$000(ScancodeExpressFragment.this) != null) {
                return ScancodeExpressFragment.access$000(ScancodeExpressFragment.this).length;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : ScancodeExpressFragment.access$000(ScancodeExpressFragment.this)[(ScancodeExpressFragment.access$000(ScancodeExpressFragment.this).length - 1) - i];
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = this.mInflater.inflate(R.layout.kakalib_listitem_card_express, (ViewGroup) null);
                aVar = new a();
                aVar.f21249a = (TextView) view.findViewById(R.id.express_listitem_sincenow);
                aVar.b = (TextView) view.findViewById(R.id.express_listitem_statusdesc);
                aVar.c = (TextView) view.findViewById(R.id.express_listitem_statustime);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            ExpressResult.ExpressSection expressSection = ScancodeExpressFragment.access$000(ScancodeExpressFragment.this)[(ScancodeExpressFragment.access$000(ScancodeExpressFragment.this).length - 1) - i];
            String str = "";
            aVar.b.setText(expressSection != null ? expressSection.statusDesc : str);
            aVar.c.setText(expressSection != null ? expressSection.statusTime : str);
            TextView textView = aVar.f21249a;
            if (expressSection != null) {
                str = expressSection.sinceNow;
            }
            textView.setText(str);
            if (i == 0) {
                aVar.f21249a.setBackgroundResource(R.drawable.kakalib_bg_express_sincenow_first);
                aVar.c.setTextColor(-8992512);
                aVar.b.setTextColor(-16777216);
                view.setBackgroundResource(R.drawable.kakalib_bg_listitem_first);
            } else {
                aVar.f21249a.setBackgroundResource(R.drawable.kakalib_bg_express_sincenow);
                aVar.c.setTextColor(-4340542);
                aVar.b.setTextColor(-4340543);
                if (i == ScancodeExpressFragment.access$000(ScancodeExpressFragment.this).length - 1) {
                    view.setBackgroundResource(R.drawable.kakalib_bg_listitem_last);
                } else {
                    view.setBackgroundResource(R.drawable.kakalib_bg_listitem);
                }
            }
            return view;
        }
    }
}
