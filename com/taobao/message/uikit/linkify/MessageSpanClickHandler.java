package com.taobao.message.uikit.linkify;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.component.unify.Dialog.TBSimpleListItem;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes7.dex */
public class MessageSpanClickHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SPAN_TEXT_EMAIL = 2;
    public static final int SPAN_TEXT_PHONE_NUM = 0;
    public static final int SPAN_TEXT_URL = 1;

    static {
        kge.a(-546410722);
    }

    public static void showMessageContextMenu(Context context, final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6093ebc", new Object[]{context, str, new Integer(i)});
        } else if (context == null) {
        } else {
            ArrayList arrayList = null;
            final String localizedString = DisplayUtil.localizedString(R.string.mp_send_sms);
            final String localizedString2 = DisplayUtil.localizedString(R.string.mp_call_1);
            final String localizedString3 = DisplayUtil.localizedString(R.string.mp_save_to_contacts);
            final String format = String.format(DisplayUtil.localizedString(R.string.mp_copy_s), str);
            final String localizedString4 = DisplayUtil.localizedString(R.string.mp_send_email);
            if (i == 0) {
                arrayList = new ArrayList();
                TBSimpleListItem tBSimpleListItem = new TBSimpleListItem();
                tBSimpleListItem.setText(localizedString);
                if (isMobilePhoneNum(str)) {
                    arrayList.add(tBSimpleListItem);
                }
                TBSimpleListItem tBSimpleListItem2 = new TBSimpleListItem();
                tBSimpleListItem2.setText(localizedString2);
                arrayList.add(tBSimpleListItem2);
                TBSimpleListItem tBSimpleListItem3 = new TBSimpleListItem();
                tBSimpleListItem3.setText(localizedString3);
                arrayList.add(tBSimpleListItem3);
                TBSimpleListItem tBSimpleListItem4 = new TBSimpleListItem();
                tBSimpleListItem4.setText(format);
                arrayList.add(tBSimpleListItem4);
            } else if (i == 2) {
                arrayList = new ArrayList();
                TBSimpleListItem tBSimpleListItem5 = new TBSimpleListItem();
                tBSimpleListItem5.setText(localizedString4);
                arrayList.add(tBSimpleListItem5);
                TBSimpleListItem tBSimpleListItem6 = new TBSimpleListItem();
                tBSimpleListItem6.setText(format);
                arrayList.add(tBSimpleListItem6);
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            new TBMaterialDialog.Builder(context).items((TBSimpleListItem[]) arrayList.toArray(new TBSimpleListItem[arrayList.size()])).itemsCallback(new TBMaterialDialog.ListCallback() { // from class: com.taobao.message.uikit.linkify.MessageSpanClickHandler.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.ListCallback
                public void onSelection(TBMaterialDialog tBMaterialDialog, View view, int i2, TBSimpleListItem tBSimpleListItem7) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("72c1a54f", new Object[]{this, tBMaterialDialog, view, new Integer(i2), tBSimpleListItem7});
                    } else if (localizedString.equals(tBSimpleListItem7.getText())) {
                        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
                        intent.setFlags(268435456);
                        ApplicationUtil.getApplication().startActivity(intent);
                    } else if (localizedString2.equals(tBSimpleListItem7.getText())) {
                        Intent intent2 = new Intent();
                        intent2.setFlags(268435456);
                        intent2.setAction("android.intent.action.DIAL");
                        intent2.setData(Uri.parse("tel:" + str));
                        ApplicationUtil.getApplication().startActivity(intent2);
                    } else if (localizedString3.equals(tBSimpleListItem7.getText())) {
                        Intent intent3 = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent3.setType("vnd.android.cursor.item/person");
                        intent3.setType("vnd.android.cursor.item/contact");
                        intent3.setType("vnd.android.cursor.item/raw_contact");
                        intent3.putExtra("phone", str);
                        intent3.setFlags(268435456);
                        ApplicationUtil.getApplication().startActivity(intent3);
                    } else if (format.equals(tBSimpleListItem7.getText())) {
                        ClipboardManager clipboardManager = (ClipboardManager) ApplicationUtil.getApplication().getSystemService("clipboard");
                        if (clipboardManager == null) {
                            return;
                        }
                        try {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText(DisplayUtil.localizedString(R.string.mp_copy_to_clipboard), str));
                        } catch (SecurityException e) {
                            TLog.loge("MessageSpanClickServiceImpl", e.toString());
                        }
                    } else if (!localizedString4.equals(tBSimpleListItem7.getText())) {
                    } else {
                        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + str)), DisplayUtil.localizedString(R.string.mp_please_select_application_to_send));
                        if (createChooser == null) {
                            TLog.loge("MessageSpanClickServiceImpl", "intent is null");
                            return;
                        }
                        createChooser.addFlags(268435456);
                        ApplicationUtil.getApplication().startActivity(createChooser);
                    }
                }
            }).show();
        }
    }

    private static boolean isMobilePhoneNum(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac236159", new Object[]{str})).booleanValue() : str.startsWith("1") && str.length() == 11;
    }
}
