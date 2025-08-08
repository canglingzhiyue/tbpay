package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TextBannerView;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import tb.kge;
import tb.sqt;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f14202a;
    private sqt b;
    private TextBannerView c;
    private LinearLayout d;
    private LinearLayout e;
    private TextView f;
    private TextView g;
    private String h = "https://h5.m.taobao.com/taolive/search.html?source=home";

    static {
        kge.a(1117837787);
    }

    public static /* synthetic */ String a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75f0727", new Object[]{eVar}) : eVar.h;
    }

    public static /* synthetic */ void a(e eVar, Context context, String str, TaoliveSearchHotWords taoliveSearchHotWords) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f48627b", new Object[]{eVar, context, str, taoliveSearchHotWords});
        } else {
            eVar.a(context, str, taoliveSearchHotWords);
        }
    }

    public static /* synthetic */ TextBannerView b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextBannerView) ipChange.ipc$dispatch("88d3b6db", new Object[]{eVar}) : eVar.c;
    }

    public e(final Context context, sqt sqtVar, ViewStub viewStub) {
        this.f14202a = context;
        this.b = sqtVar;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.live_search_new_flexalocal);
            this.d = (LinearLayout) viewStub.inflate();
            this.c = (TextBannerView) this.d.findViewById(R.id.live_search_new_hints);
            this.f = (TextView) this.d.findViewById(R.id.search_default_hint);
            this.g = (TextView) this.d.findViewById(R.id.search_btn);
            TextView textView = this.g;
            if (textView == null) {
                return;
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    e eVar = e.this;
                    e.a(eVar, context, e.a(eVar), e.b(e.this).getClickItemData());
                }
            });
        }
    }

    public void a(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920f557f", new Object[]{this, linearLayout});
        } else {
            this.e = linearLayout;
        }
    }

    public TextBannerView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextBannerView) ipChange.ipc$dispatch("4678f6e9", new Object[]{this}) : this.c;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!i.aa()) {
        } else {
            if (i == 1) {
                LinearLayout linearLayout = this.d;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.e;
                if (linearLayout2 == null) {
                    return;
                }
                linearLayout2.setVisibility(8);
                return;
            }
            LinearLayout linearLayout3 = this.d;
            if (linearLayout3 == null) {
                return;
            }
            linearLayout3.setVisibility(8);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!i.aa()) {
        } else {
            TextBannerView textBannerView = this.c;
            if (textBannerView != null) {
                textBannerView.setVisibility(8);
            }
            TextView textView = this.f;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            this.f.setText(str);
        }
    }

    public void b() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!i.aa() || (textView = this.f) == null) {
        } else {
            textView.setVisibility(8);
        }
    }

    private void a(Context context, String str, TaoliveSearchHotWords taoliveSearchHotWords) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8156b50a", new Object[]{this, context, str, taoliveSearchHotWords});
        } else if (taoliveSearchHotWords == null) {
        } else {
            String str2 = taoliveSearchHotWords.word;
            String str3 = taoliveSearchHotWords.type;
            String str4 = taoliveSearchHotWords.url;
            if (!StringUtils.isEmpty(str4)) {
                Nav.from(context).toUri(str4);
            } else if (StringUtils.isEmpty(str)) {
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("word", str2);
                bundle.putString("type", str3);
                bundle.putString("url", str4);
                sqt sqtVar = this.b;
                if (sqtVar != null && sqtVar.C != null) {
                    if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW.equals(this.b.C.channelType)) {
                        if (str.contains("?")) {
                            str = str + "&search_entry=follow&spm=a2141.taolive_follow&spmPre=a2141.taolive_follow";
                        } else {
                            str = str + "?search_entry=follow&spm=a2141.taolive_follow&spmPre=a2141.taolive_follow";
                        }
                    } else if ("jingxuan".equals(this.b.C.channelType)) {
                        if (str.contains("?")) {
                            str = str + "&search_entry=jingxuan&spm=a2141.8001240&spmPre=a2141.8001240";
                        } else {
                            str = str + "?search_entry=jingxuan&spm=a2141.8001240&spmPre=a2141.8001240";
                        }
                    }
                }
                if (!StringUtils.isEmpty(str2)) {
                    str = str + "&keyword=" + Uri.encode(str2);
                }
                if (!StringUtils.isEmpty(str3)) {
                    str = str + "&type=" + Uri.encode(str3);
                }
                if (taoliveSearchHotWords.rightInfo != null) {
                    str = str + "&rightInfo=" + Uri.encode(JSON.toJSONString(taoliveSearchHotWords.rightInfo));
                }
                Nav.from(context).withExtras(bundle).toUri(str);
            }
        }
    }
}
