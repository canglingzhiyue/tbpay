package com.taobao.search.m3.title;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.common.util.l;
import com.taobao.search.mmd.uikit.b;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import com.taobao.search.searchdoor.sf.config.TbSearchStyleCard;
import com.taobao.search.searchdoor.sf.config.TbSearchStyleCommon;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class M3Title extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int clickedColor;
    private static final float defaultTs;
    private static final int iconHeight;
    private static final int normalColor;
    private int currentNormalColor;
    private final ArrayList<com.taobao.search.m3.title.a> icons;

    public static /* synthetic */ Object ipc$super(M3Title m3Title, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }

    public M3Title(Context context) {
        super(context);
        this.icons = new ArrayList<>(1);
        this.currentNormalColor = normalColor;
        setTextSize(0, defaultTs);
        setLineSpacing(l.a(1.0f), 1.0f);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-2107618162);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(689316038);
        Companion = new a(null);
        iconHeight = l.a(14.0f);
        clickedColor = Color.parseColor("#999999");
        normalColor = Color.parseColor("#333333");
        defaultTs = l.a(15.0f);
    }

    public final void update(SearchDomBean searchDomBean, String str, boolean z, int i, boolean z2, TbSearchStyle tbSearchStyle) {
        TbSearchStyleCard tbSearchStyleCard;
        TbSearchStyleCommon tbSearchStyleCommon;
        TbSearchStyleCard tbSearchStyleCard2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7ea5df", new Object[]{this, searchDomBean, str, new Boolean(z), new Integer(i), new Boolean(z2), tbSearchStyle});
            return;
        }
        setTextSize(0, (tbSearchStyle == null || (tbSearchStyleCard2 = tbSearchStyle.card) == null) ? defaultTs : tbSearchStyleCard2.titleTextSize);
        this.currentNormalColor = (tbSearchStyle == null || (tbSearchStyleCommon = tbSearchStyle.common) == null) ? normalColor : tbSearchStyleCommon.mainTextColor;
        setMaxLines(i);
        TextPaint paint = getPaint();
        q.a((Object) paint, "paint");
        paint.setFakeBoldText((tbSearchStyle == null || (tbSearchStyleCard = tbSearchStyle.card) == null) ? false : tbSearchStyleCard.titleBold);
        if (z2) {
            setLines(i);
        }
        releaseIcons();
        setTextColor(z ? clickedColor : this.currentNormalColor);
        if (searchDomBean == null) {
            setText(str);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) " ");
        Context context = getContext();
        q.a((Object) context, "context");
        com.taobao.search.m3.title.a aVar = new com.taobao.search.m3.title.a(searchDomBean, context, iconHeight);
        aVar.setCallback(this);
        aVar.a();
        spannableStringBuilder.setSpan(new b(aVar), 0, 1, 33);
        this.icons.add(aVar);
        if (str != null) {
            spannableStringBuilder.append((CharSequence) str);
        }
        setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        releaseIcons();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Iterator<com.taobao.search.m3.title.a> it = this.icons.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private final void releaseIcons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d58ca5a", new Object[]{this});
            return;
        }
        Iterator<com.taobao.search.m3.title.a> it = this.icons.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.icons.clear();
    }
}
