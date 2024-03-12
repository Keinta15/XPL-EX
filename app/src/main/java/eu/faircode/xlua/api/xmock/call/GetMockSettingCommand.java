package eu.faircode.xlua.api.xmock.call;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import eu.faircode.xlua.BuildConfig;
import eu.faircode.xlua.api.XProxyContent;
import eu.faircode.xlua.api.settings.XLuaSettingPacket;
import eu.faircode.xlua.api.standard.CallCommandHandler;
import eu.faircode.xlua.api.standard.command.CallPacket;
import eu.faircode.xlua.api.xlua.call.GetSettingCommand;
import eu.faircode.xlua.api.xlua.database.XLuaSettingsDatabase;
import eu.faircode.xlua.utilities.BundleUtil;

/*public class GetMockSettingCommand extends CallCommandHandler {
    public static GetMockSettingCommand create() { return new GetMockSettingCommand(); };
    public GetMockSettingCommand() {
        name = "getMockSetting";
        requiresPermissionCheck = false;
    }

    @Override
    public Bundle handle(CallPacket commandData) throws Throwable {
        throwOnPermissionCheck(commandData.getContext());
        XLuaSettingPacket packet = commandData.read(XLuaSettingPacket.class);

        if(BuildConfig.DEBUG)
            Log.i("XLua.GetSettingCommand", "handler packet=" + packet);

        //wtf is this shit used for ?
        if(packet.getValue() != null && packet.getValue().equals("*")) {
            return XLuaSettingsDatabase.getSetting(
                    commandData.getDatabase(),
                    packet.getName(),
                    packet.getUser(),
                    packet.getCategory()).toBundle();
        } else {
            return BundleUtil.
                    createSingleString("value",
                            XLuaSettingsDatabase.getSettingValue(
                                    commandData.getContext(),
                                    commandData.getDatabase(),
                                    packet.getName(),
                                    packet.getUser(),
                                    packet.getCategory()));
        }
    }

    public static Bundle invoke(Context context, Integer userId, String category, String name) { return invoke(context, userId, category, name, null); }
    public static Bundle invoke(Context context, Integer userId, String category, String name, String value) {
        XLuaSettingPacket packet = new XLuaSettingPacket(userId, category, name, value);
        return invoke(context, packet);
    }

    public static Bundle invoke(Context context, XLuaSettingPacket packet) {
        return XProxyContent.luaCall(
                context,
                "getSetting",
                packet.toBundle());
    }
}*/
