package com.xworkz.politician.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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
			// System.out.println(resultSet.next());
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

			String search = "select * from politician.politician_info where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(search);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString(2);
				return name;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String findPresidentByIdAndName(Integer id, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {
			String search = "select president from politician.politician_info where id = ? and name = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				String president = resultSet.getString(1);
				PoliticianDto politicianDto = new PoliticianDto();
				politicianDto.setPresident(president);
				return president;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer getTotal() {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {

			AtomicInteger atomicInteger = new AtomicInteger();
			String query = "select * from politician_info";
			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				atomicInteger.incrementAndGet();
			}
			System.out.println(atomicInteger);
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return 0;

	}

	
	@Override
	public List<PoliticianDto> findAll() {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {
			String sql = "Select * from politician.politician_info";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<PoliticianDto> pDtos = new ArrayList<PoliticianDto>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String partyOfficeLocation = resultSet.getString(4);
				Integer members = resultSet.getInt(5);
				Double budjet = resultSet.getDouble(6);
				String president = resultSet.getString(7);
				String headQuatress = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				PoliticianDto pDto = new PoliticianDto();
				pDto.setId(id);
				pDto.setName(name);
				pDto.setPartyName(PartyName.getByPartyName(partyName));
				pDto.setPartyOfficeLocation(partyOfficeLocation);
				pDto.setTotalMembers(members);
				pDto.setPartyBudject(budjet);
				pDto.setPresident(president);
				pDto.setHeadQuatress(headQuatress);
				pDto.setPartySymbol(PartySymbol.getPartySymbolById(partySymbol));
				pDtos.add(pDto);

			}
			System.out.println("Total politician added:" + pDtos.size());
			return pDtos;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return PoliticianDao.super.findAll();
	}

	@Override
	public List<String> findAllPartyName() {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {
			String sql = "Select partyName from politician.politician_info";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<String> pDtos = new ArrayList<String>();
			while (resultSet.next()) {
				String partyName = resultSet.getString(1);
				pDtos.add(partyName);
			}
			System.out.println("partyName is added:" + pDtos.size());
			return pDtos;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Integer> findAllInteger() {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {
			String sql = "Select id from politician.politician_info";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<Integer> pDtos1 = new ArrayList<Integer>();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				pDtos1.add(id);
			}
			System.out.println("Id is added:" + pDtos1.size());
			return pDtos1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
	@Override
	public List<Object> findAllNoOfMembersAndFundAndPartyName() {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRETE.getValue());) {
			String sql = "select totalmembers,partybudject,partyname from politician_info";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet resultSet = stmt.executeQuery();
			List<Object> list = new ArrayList<Object>();
			while(resultSet.next()) {
				Integer members = resultSet.getInt(1);
				Double budjet = resultSet.getDouble(2);
				String name = resultSet.getString(3);
				list.add(members);
				list.add(budjet);
				list.add(name);
			}
			System.out.println("The NoOFMenbers and TotalBudjetOfParty and PartyName is: " + list.size());
			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return PoliticianDao.super.findAllNoOfMembersAndFundAndPartyName();
	}
}
