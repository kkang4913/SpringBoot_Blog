package com.cos.blog.handler;

import com.cos.blog.model.RoleType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleTypeHandler extends BaseTypeHandler<RoleType> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, RoleType parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.name()); // Enum 값을 문자열로 변환하여 저장

    }

    @Override
    public RoleType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String value = rs.getString(columnName);
        return (value == null) ? null : RoleType.valueOf(value); // 데이터베이스에서 가져온 문자열을 Enum으로 변환

    }

    @Override
    public RoleType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String value = rs.getString(columnIndex);
        return (value == null) ? null : RoleType.valueOf(value); // 데이터베이스에서 가져온 문자열을 Enum으로 변환
    }

    @Override
    public RoleType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String value = cs.getString(columnIndex);
        return (value == null) ? null : RoleType.valueOf(value); // 데이터베이스에서 가져온 문자열을 Enum으로 변환
    }
}
