package com.taobao.login4android.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.utils.LanguageUtil;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class NoNetworkActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView mStep1TV;
    public TextView mStep2TV;

    static {
        kge.a(1551308031);
    }

    public static /* synthetic */ Object ipc$super(NoNetworkActivity noNetworkActivity, String str, Object... objArr) {
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
        j.b(context);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.aliuser_activity_no_network);
        this.mStep1TV = (TextView) findViewById(R.id.aliuser_net_content_2);
        this.mStep2TV = (TextView) findViewById(R.id.aliuser_net_content_3);
        if (!LanguageUtil.isChineseLanguage()) {
            String string = getString(R.string.aliuser_network_set_hint1);
            String string2 = getString(R.string.aliuser_network_set_hint2);
            String string3 = getString(R.string.aliuser_network_set1);
            String string4 = getString(R.string.aliuser_network_set2);
            setText(this.mStep1TV, string, string3);
            setText(this.mStep2TV, string2, string4);
        }
        findViewById(R.id.aliuser_ic_close).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.NoNetworkActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    NoNetworkActivity.this.finish();
                }
            }
        });
    }

    private void setText(TextView textView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85cbb62", new Object[]{this, textView, str, str2});
            return;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            int indexOf = str.indexOf(str2);
            int length = str2.length() + indexOf;
            spannableString.setSpan(new ClickableSpan() { // from class: com.taobao.login4android.ui.NoNetworkActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str3, Object... objArr) {
                    if (str3.hashCode() == -1038128277) {
                        super.updateDrawState((TextPaint) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                }

                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                        return;
                    }
                    super.updateDrawState(textPaint);
                    textPaint.setColor(NoNetworkActivity.this.getResources().getColor(R.color.aliuser_color_111));
                    textPaint.setUnderlineText(false);
                }
            }, indexOf, length, 33);
            spannableString.setSpan(new StyleSpan(1), indexOf, length, 33);
            textView.setText(spannableString);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
