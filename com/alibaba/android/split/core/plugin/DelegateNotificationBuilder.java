package com.alibaba.android.split.core.plugin;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class DelegateNotificationBuilder extends Notification.Builder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1729610295);
    }

    public static /* synthetic */ Object ipc$super(DelegateNotificationBuilder delegateNotificationBuilder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2050800682:
                return super.setStyle((Notification.Style) objArr[0]);
            case -2046706120:
                return super.setLights(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            case -2021265773:
                return super.setAutoCancel(((Boolean) objArr[0]).booleanValue());
            case -1945226144:
                return super.setUsesChronometer(((Boolean) objArr[0]).booleanValue());
            case -1635140717:
                return super.setContentIntent((PendingIntent) objArr[0]);
            case -1628043932:
                return super.setCategory((String) objArr[0]);
            case -1595384916:
                return super.setTicker((CharSequence) objArr[0], (RemoteViews) objArr[1]);
            case -1567279310:
                return super.setVibrate((long[]) objArr[0]);
            case -1363932699:
                return super.setSound((Uri) objArr[0], ((Number) objArr[1]).intValue());
            case -1338996867:
                return super.setLocalOnly(((Boolean) objArr[0]).booleanValue());
            case -1212324219:
                return super.setContent((RemoteViews) objArr[0]);
            case -1203577569:
                return super.setPriority(((Number) objArr[0]).intValue());
            case -1135353638:
                return super.setColor(((Number) objArr[0]).intValue());
            case -746299093:
                return super.setPublicVersion((Notification) objArr[0]);
            case -705238208:
                return super.setLargeIcon((Bitmap) objArr[0]);
            case -649268116:
                return super.addExtras((Bundle) objArr[0]);
            case -418471247:
                return super.setGroupSummary(((Boolean) objArr[0]).booleanValue());
            case -352850430:
                return super.addAction(((Number) objArr[0]).intValue(), (CharSequence) objArr[1], (PendingIntent) objArr[2]);
            case -133664796:
                return super.getNotification();
            case -124880665:
                return super.extend((Notification.Extender) objArr[0]);
            case -87732858:
                return super.setContentText((CharSequence) objArr[0]);
            case -24733175:
                return super.setDeleteIntent((PendingIntent) objArr[0]);
            case 57478029:
                return super.setVisibility(((Number) objArr[0]).intValue());
            case 136096877:
                return super.setExtras((Bundle) objArr[0]);
            case 211619657:
                return super.setContentTitle((CharSequence) objArr[0]);
            case 262458789:
                return super.setContentInfo((CharSequence) objArr[0]);
            case 280513765:
                return super.setSortKey((String) objArr[0]);
            case 291165911:
                return super.setSmallIcon(((Number) objArr[0]).intValue());
            case 330123287:
                return super.setProgress(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue());
            case 331766782:
                return super.setTicker((CharSequence) objArr[0]);
            case 570836383:
                return super.setSubText((CharSequence) objArr[0]);
            case 720528457:
                return super.setSound((Uri) objArr[0], (AudioAttributes) objArr[1]);
            case 779238515:
                return super.addAction((Notification.Action) objArr[0]);
            case 889291982:
                return super.addPerson((String) objArr[0]);
            case 1007818593:
                return super.setShowWhen(((Boolean) objArr[0]).booleanValue());
            case 1057312193:
                return super.setOngoing(((Boolean) objArr[0]).booleanValue());
            case 1114045808:
                return super.setSmallIcon(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            case 1292000247:
                return super.build();
            case 1351431044:
                return super.setNumber(((Number) objArr[0]).intValue());
            case 1529362324:
                return super.setWhen(((Number) objArr[0]).longValue());
            case 1613718349:
                return super.setDefaults(((Number) objArr[0]).intValue());
            case 1613723911:
                return super.setGroup((String) objArr[0]);
            case 1711670820:
                return super.getExtras();
            case 1873799106:
                return super.setSound((Uri) objArr[0]);
            case 1995741085:
                return super.setFullScreenIntent((PendingIntent) objArr[0], ((Boolean) objArr[1]).booleanValue());
            case 2053609207:
                return super.setOnlyAlertOnce(((Boolean) objArr[0]).booleanValue());
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public DelegateNotificationBuilder(Context context) {
        super(context);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setShortcutId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("d3121781", new Object[]{this, str}) : super.setShortcutId(str);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setLocusId(LocusId locusId) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("38d8cfd5", new Object[]{this, locusId}) : super.setLocusId(locusId);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setBadgeIconType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("eaa17d4d", new Object[]{this, new Integer(i)}) : super.setBadgeIconType(i);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setGroupAlertBehavior(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("341a444a", new Object[]{this, new Integer(i)}) : super.setGroupAlertBehavior(i);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setBubbleMetadata(Notification.BubbleMetadata bubbleMetadata) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("1604b3be", new Object[]{this, bubbleMetadata}) : super.setBubbleMetadata(bubbleMetadata);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setChannelId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("aaeda28", new Object[]{this, str}) : super.setChannelId(str);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setTimeoutAfter(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("17f40e95", new Object[]{this, new Long(j)}) : super.setTimeoutAfter(j);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setWhen(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("5b283794", new Object[]{this, new Long(j)}) : super.setWhen(j);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setShowWhen(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("3c121761", new Object[]{this, new Boolean(z)}) : super.setShowWhen(z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setUsesChronometer(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("8c0e3460", new Object[]{this, new Boolean(z)}) : super.setUsesChronometer(z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setChronometerCountDown(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("42e333b5", new Object[]{this, new Boolean(z)}) : super.setChronometerCountDown(z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setSmallIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification.Builder) ipChange.ipc$dispatch("115ad6d7", new Object[]{this, new Integer(i)});
        }
        Log.e("DelegateNotification", "setSmallIcon:" + i);
        Log.e("DelegateNotification", "new ID:" + j.h().e().getResources().getIdentifier("tao_mag_icon_white", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "com.taobao.taobao"));
        if (String.valueOf(i).startsWith("211")) {
            return super.setSmallIcon(j.h().e().getResources().getIdentifier("tao_mag_icon_white", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "com.taobao.taobao"));
        }
        return super.setSmallIcon(i);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setSmallIcon(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification.Builder) ipChange.ipc$dispatch("4266fd70", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Log.e("DelegateNotification", "setSmallIcon:" + i);
        if (String.valueOf(i).startsWith("211")) {
            return super.setSmallIcon(j.h().e().getResources().getIdentifier("tao_mag_icon_white", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "com.taobao.taobao"));
        }
        return super.setSmallIcon(i, i2);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setSmallIcon(Icon icon) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("558eb747", new Object[]{this, icon}) : super.setSmallIcon(icon);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setContentTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("c9d0f49", new Object[]{this, charSequence}) : super.setContentTitle(charSequence);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setContentText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("fac54d86", new Object[]{this, charSequence}) : super.setContentText(charSequence);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setSubText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("2206459f", new Object[]{this, charSequence}) : super.setSubText(charSequence);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setSettingsText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("83a9be58", new Object[]{this, charSequence}) : super.setSettingsText(charSequence);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("836a9355", new Object[]{this, charSequenceArr}) : super.setRemoteInputHistory(charSequenceArr);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setNumber(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("508d3384", new Object[]{this, new Integer(i)}) : super.setNumber(i);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setContentInfo(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("fa4cda5", new Object[]{this, charSequence}) : super.setContentInfo(charSequence);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setProgress(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("13ad4817", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)}) : super.setProgress(i, i2, z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setContent(RemoteViews remoteViews) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("b7bd6685", new Object[]{this, remoteViews}) : super.setContent(remoteViews);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setCustomContentView(RemoteViews remoteViews) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("6f4e0871", new Object[]{this, remoteViews}) : super.setCustomContentView(remoteViews);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setCustomBigContentView(RemoteViews remoteViews) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("9b48a88b", new Object[]{this, remoteViews}) : super.setCustomBigContentView(remoteViews);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("6ae72899", new Object[]{this, remoteViews}) : super.setCustomHeadsUpContentView(remoteViews);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setContentIntent(PendingIntent pendingIntent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("9e89bb93", new Object[]{this, pendingIntent}) : super.setContentIntent(pendingIntent);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setDeleteIntent(PendingIntent pendingIntent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("fe869a09", new Object[]{this, pendingIntent}) : super.setDeleteIntent(pendingIntent);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("76f4979d", new Object[]{this, pendingIntent, new Boolean(z)}) : super.setFullScreenIntent(pendingIntent, z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setTicker(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("13c65bfe", new Object[]{this, charSequence}) : super.setTicker(charSequence);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("a0e85bac", new Object[]{this, charSequence, remoteViews}) : super.setTicker(charSequence, remoteViews);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setLargeIcon(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("d5f6eb40", new Object[]{this, bitmap}) : super.setLargeIcon(bitmap);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setLargeIcon(Icon icon) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("44e3eb93", new Object[]{this, icon}) : super.setLargeIcon(icon);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setSound(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("6fafe7c2", new Object[]{this, uri}) : super.setSound(uri);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setSound(Uri uri, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("aeb409e5", new Object[]{this, uri, new Integer(i)}) : super.setSound(uri, i);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setSound(Uri uri, AudioAttributes audioAttributes) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("2af26449", new Object[]{this, uri, audioAttributes}) : super.setSound(uri, audioAttributes);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setVibrate(long[] jArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("a2953732", new Object[]{this, jArr}) : super.setVibrate(jArr);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setLights(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("8601be38", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)}) : super.setLights(i, i2, i3);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setOngoing(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("3f054dc1", new Object[]{this, new Boolean(z)}) : super.setOngoing(z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setColorized(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("7fe5ec39", new Object[]{this, new Boolean(z)}) : super.setColorized(z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setOnlyAlertOnce(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("7a6796f7", new Object[]{this, new Boolean(z)}) : super.setOnlyAlertOnce(z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setAutoCancel(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("8785ee93", new Object[]{this, new Boolean(z)}) : super.setAutoCancel(z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setLocalOnly(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("b030877d", new Object[]{this, new Boolean(z)}) : super.setLocalOnly(z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setDefaults(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("602f634d", new Object[]{this, new Integer(i)}) : super.setDefaults(i);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setPriority(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("b842dd1f", new Object[]{this, new Integer(i)}) : super.setPriority(i);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setCategory(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("9ef60564", new Object[]{this, str}) : super.setCategory(str);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder addPerson(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("350184ce", new Object[]{this, str}) : super.addPerson(str);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder addPerson(Person person) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("cb04ae8c", new Object[]{this, person}) : super.addPerson(person);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setGroup(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("602f7907", new Object[]{this, str}) : super.setGroup(str);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setGroupSummary(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("e70ea2b1", new Object[]{this, new Boolean(z)}) : super.setGroupSummary(z);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setSortKey(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("10b84ce5", new Object[]{this, str}) : super.setSortKey(str);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder addExtras(Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("d94cf46c", new Object[]{this, bundle}) : super.addExtras(bundle);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setExtras(Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("81cac6d", new Object[]{this, bundle}) : super.setExtras(bundle);
    }

    @Override // android.app.Notification.Builder
    public Bundle getExtras() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this}) : super.getExtras();
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("eaf7ee02", new Object[]{this, new Integer(i), charSequence, pendingIntent}) : super.addAction(i, charSequence, pendingIntent);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder addAction(Notification.Action action) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("2e723c73", new Object[]{this, action}) : super.addAction(action);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setActions(Notification.Action... actionArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("6dfc3988", new Object[]{this, actionArr}) : super.setActions(actionArr);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setStyle(Notification.Style style) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("85c343d6", new Object[]{this, style}) : super.setStyle(style);
    }

    @Override // android.app.Notification.Builder
    public Notification.Style getStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Style) ipChange.ipc$dispatch("3ebf67fd", new Object[]{this}) : super.getStyle();
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setVisibility(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("36d0b8d", new Object[]{this, new Integer(i)}) : super.setVisibility(i);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setPublicVersion(Notification notification) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("d384612b", new Object[]{this, notification}) : super.setPublicVersion(notification);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder extend(Notification.Extender extender) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("f88e78e7", new Object[]{this, extender}) : super.extend(extender);
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setColor(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("bc53e0da", new Object[]{this, new Integer(i)}) : super.setColor(i);
    }

    @Override // android.app.Notification.Builder
    public RemoteViews createContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteViews) ipChange.ipc$dispatch("f8be8adf", new Object[]{this}) : super.createContentView();
    }

    @Override // android.app.Notification.Builder
    public RemoteViews createBigContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteViews) ipChange.ipc$dispatch("aea29a47", new Object[]{this}) : super.createBigContentView();
    }

    @Override // android.app.Notification.Builder
    public RemoteViews createHeadsUpContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteViews) ipChange.ipc$dispatch("88fd9a55", new Object[]{this}) : super.createHeadsUpContentView();
    }

    @Override // android.app.Notification.Builder
    public Notification.Builder setAllowSystemGeneratedContextualActions(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification.Builder) ipChange.ipc$dispatch("7e19f5db", new Object[]{this, new Boolean(z)}) : super.setAllowSystemGeneratedContextualActions(z);
    }

    @Override // android.app.Notification.Builder
    public Notification getNotification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification) ipChange.ipc$dispatch("f8086fe4", new Object[]{this}) : super.getNotification();
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification) ipChange.ipc$dispatch("4d025bf7", new Object[]{this}) : super.build();
    }
}
