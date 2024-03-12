function after(hook, param)
    local res = param:getResult()
    if res == nil then
        return false
    end

    local setting = param:getSetting("network.host.address", "12.7.0.0.1");
    local fake = param:getIpAddressBytes(setting)
    param:setResultByteArray(fake)
    return true
end
