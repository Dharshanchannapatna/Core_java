package com.xworkz.politician.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.politician.constants.PartyName;
import com.xworkz.politician.constants.PartySymbol;
import com.xworkz.politician.dto.PoliticianDto;
import static com.xworkz.politician.constants.MysqlProperties.*;

public class PoliticianDaoImpl implements PoliticianDao {

	@Override
	public Boolean save(PoliticianDto politicianDto) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {
			String insert = "INSERT into politician.politician_info values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setInt(1, politicianDto.getId());
			preparedStatement.setString(2, politicianDto.getName());
			preparedStatement.setString(3, politicianDto.getPartyName().getPartyName());
			preparedStatement.setString(4, politicianDto.getPartyOfficeLocation());
			preparedStatement.setInt(5, politicianDto.getTotalMembers());
			preparedStatement.setDouble(6, politicianDto.getPartyBudject());
			preparedStatement.setString(7, politicianDto.getPresident());
			preparedStatement.setString(8, politicianDto.getHeadQuatress());
			preparedStatement.setString(9, politicianDto.getPartySymbol().getPartySymbol());
			int noOfRowsAffected = preparedStatement.executeUpdate();
			if (noOfRowsAffected > 0) {
				System.out.println("The value Inserted are:" + insert);
			} else {
				System.out.println("unable to insert");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDto findById(Integer id) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {

			String select = "SELECT * FROM politician.politician_info Where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Integer id1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String location = resultSet.getString(4);
				Integer totalMembers = resultSet.getInt(5);
				Double budject = resultSet.getDouble(6);
				String president = resultSet.getString(7);
				String headQuatress = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				PoliticianDto politicianDto = new PoliticianDto();
				politicianDto.setId(id1);
				politicianDto.setName(name);
				politicianDto.setPartyName(PartyName.getByPartyName(partyName));
				politicianDto.setPartyOfficeLocation(location);
				politicianDto.setTotalMembers(totalMembers);
				politicianDto.setPartyBudject(budject);
				politicianDto.setPresident(president);
				politicianDto.setHeadQuatress(headQuatress);
				politicianDto.setPartySymbol(PartySymbol.getPartySymbolById(partySymbol));

				return politicianDto;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDto findByIdAndPresident(Integer id, String president) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {

			String select = "SELECT * FROM politician.politician_info Where id=? and president=?";
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, president);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Integer id1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String location = resultSet.getString(4);
				Integer totalMembers = resultSet.getInt(5);
				Double budject = resultSet.getDouble(6);
				String president1 = resultSet.getString(7);
				String headQuatress = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				PoliticianDto politicianDto = new PoliticianDto();
				politicianDto.setId(id1);
				politicianDto.setName(name);
				politicianDto.setPartyName(PartyName.getByPartyName(partyName));
				politicianDto.setPartyOfficeLocation(location);
				politicianDto.setTotalMembers(totalMembers);
				politicianDto.setPartyBudject(budject);
				politicianDto.setPresident(president1);
				politicianDto.setHeadQuatress(headQuatress);
				politicianDto.setPartySymbol(PartySymbol.getPartySymbolById(partySymbol));

				return politicianDto;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public PoliticianDto findByIdAndNameAndPresident(Integer id, String name, String president) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {

			String select = "SELECT * FROM politician.politician_info Where id=? and name=? and president=?";
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, president);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Integer id1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String location = resultSet.getString(4);
				Integer totalMembers = resultSet.getInt(5);
				Double budject = resultSet.getDouble(6);
				String president1 = resultSet.getString(7);
				String headQuatress = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				PoliticianDto politicianDto = new PoliticianDto();
				politicianDto.setId(id1);
				politicianDto.setName(name);
				politicianDto.setPartyName(PartyName.getByPartyName(partyName));
				politicianDto.setPartyOfficeLocation(location);
				politicianDto.setTotalMembers(totalMembers);
				politicianDto.setPartyBudject(budject);
				politicianDto.setPresident(president1);
				politicianDto.setHeadQuatress(headQuatress);
				politicianDto.setPartySymbol(PartySymbol.getPartySymbolById(partySymbol));

				return politicianDto;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public PoliticianDto findByIdAndName(Integer id, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {

			String select = "SELECT * FROM politician.politician_info Where id=? and name=?";
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Integer id1 = resultSet.getInt(1);
				String name2 = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String location = resultSet.getString(4);
				Integer totalMembers = resultSet.getInt(5);
				Double budject = resultSet.getDouble(6);
				String president1 = resultSet.getString(7);
				String headQuatress = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				PoliticianDto politicianDto = new PoliticianDto();
				politicianDto.setId(id1);
				politicianDto.setName(name2);
				politicianDto.setPartyName(PartyName.getByPartyName(partyName));
				politicianDto.setPartyOfficeLocation(location);
				politicianDto.setTotalMembers(totalMembers);
				politicianDto.setPartyBudject(budject);
				politicianDto.setPresident(president1);
				politicianDto.setHeadQuatress(headQuatress);
				politicianDto.setPartySymbol(PartySymbol.getPartySymbolById(partySymbol));

				return politicianDto;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findNameById(Integer id) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {

			String select = "SELECT * FROM politician.politician_info Where id=;
			Statement statement = connection.createStatement();
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String name=resultSet.getString(1);
				return name;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}
}
